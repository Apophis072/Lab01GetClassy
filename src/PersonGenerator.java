
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator
{
    public static ArrayList<Person> list = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args)

    {
        boolean finished = false;
        //This program saves information about a person based on user input
        System.out.println("Enter information for each person");
        do
        {
            String ID = SafeInput.getRegExString(in, "Enter your ID", "^\\d{6}$");
            String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
            String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
            String title = SafeInput.getNonZeroLenString(in, "Enter your title (Mr, Mrs, etc)");
            int birthYear = SafeInput.getRangedInt(in, "Enter your year of birth", 1940, 2010);

            Person personData = new Person(ID, firstName, lastName,title,birthYear);

            list.add(personData);
            System.out.println("JSON: " + personData.toJSONRecord());
            System.out.println("XML: " + personData.toXMLRecord());
            System.out.println("CVS: " + personData.toCSVRecord());
             finished = SafeInput.getYNConfirm(in, "Is this information for everyone");

             in.nextLine();


        }while (!finished);



            String fileName = SafeInput.getNonZeroLenString(in, "Enter the name of the file to save these input");

            fileName = fileName + ".txt";

            File file = new File(fileName);

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file)))
        {

            for (Person p : list)
            {
                br.write(p.toCSVRecord());
                br.newLine();
            }
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }

    }
}