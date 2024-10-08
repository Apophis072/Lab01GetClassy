import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductWriter
{
public static void main(String[] args)
{
    boolean finished = false;
    Scanner in = new Scanner(System.in);
    ArrayList<Product> list = new ArrayList<>();
    //This program saves information about a person based on user input
    System.out.println("Enter information for each product");
    do
    {
        String ID = SafeInput.getRegExString(in, "Assign a ID", "^\\d{6}$");
        String name = SafeInput.getNonZeroLenString(in, "Enter the name of the product");
        String description = SafeInput.getNonZeroLenString(in, "Enter a description");
        double cost = SafeInput.getDouble(in, "Enter the cost of the product");

        Product productInfo = new Product(ID,name,description,cost);

        list.add(productInfo);

        finished = SafeInput.getYNConfirm(in, "Is this all the information?");

        System.out.println("JSON: " + productInfo.toJSONRecord());
        System.out.println("XML: " + productInfo.toXMLRecord());
        System.out.println("CVS: " + productInfo.toCSVRecord());

        in.nextLine();

    }while (!finished);



    String fileName = SafeInput.getNonZeroLenString(in, "Enter the name of the file to save these input");

    fileName = fileName + ".txt";

    File file = new File(fileName);


    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
    {

        for (Product p : list)
        {
            bw.write(p.toCSVRecord());
            bw.newLine();
        }
        bw.close();
    }
    catch (IOException e)
    {
        e.printStackTrace();

    }
}
}