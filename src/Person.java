import java.util.Scanner;

public class Person
{
        private String ID;
        private String firstName;
        private String lastName;
        private String title;
        private int birthYear;
        static private int IDSeed = 1;
        public String fullName;
        public String formalName;
        static public int getAge;
        public int FutureAge;
    public Person(String ID, String firstName, String lastName, String title, int birthYear)
    {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.birthYear = birthYear;
    }

    //This method gets the age of a Person at a certain year
    public void setFutureAge(int year)
    {
        this.FutureAge = year - birthYear;

    }

    //This pulls and displays the age of a Person at a certain year in the future
    public int getFutureAge()
    {
    return FutureAge;
    }

    //This method gets the current age of a Person
    public void setGetAge(int getAge)
    {
        this.getAge = 2024 - birthYear;
    }

    //This pulls and displays the current age of a Person
    public int getGetAge()
    {
        return getAge;
    }

    //This methods puts together a Person's formal name based on his/her title and last name
    public void setFormalName(String formalName)
    {
        this.formalName = title + " " + lastName;
    }

    //This pulls and display the formal name of a Person
    public String getFormalName()
    {
        return formalName;
    }

    //This method puts together a Person's full name based on the first and last name
    public void setFullName(String fullName)
    {
        this.fullName = firstName + " " + lastName;
    }

    //This pulls and displays a Person's full name
    public String getFullName()
    {
        return fullName;
    }

    //This pulls and displays a person's ID
    public String getID() {
        return ID;
    }

    //This changes a Person's ID based on input
    public void setID(String ID) {
        this.ID = ID;
    }

    //This pulls and displays a Person's first name
    public String getFirstName() {
        return firstName;
    }

    //This changes a Person's first name based on input
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //This pulls and displays a Person's last name based
    public String getLastName() {
        return lastName;
    }

    //This changes a Person's last name based on input
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //This pulls and displays a Person's title
    public String getTitle() {
        return title;
    }

    //This changes a Person's title based on input
    public void setTitle(String title) {
        this.title = title;
    }

    //This pulls and displays a Person's year of birth
    public int getbirthYear() {
        return birthYear;
    }

    //This changes a Person's year of birth based on input
    public void setbirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public static int getIDSeed() {
        return IDSeed;
    }

    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
    }

    @Override
    //Format that the data could be saved in
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    //Format that the data could be saved in
    public String toJSONRecord()
    {
        String retString = "";
        char DQ = '\u0022';  // Assign the double quote char to a variable
        retString =  "{" + DQ + "IDNum" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + this.firstName + DQ + ",";
        retString += " " + DQ + "lastName"  + DQ + ":" + DQ + this.lastName + DQ + ",";
        retString += " " + DQ + "Title" + DQ + ": " + DQ + this.title + DQ + ",";
        retString += " " + DQ + "YOB"  + DQ + ":" + this.birthYear + "}";

        return retString;
    }

    //Format that the data could be saved in
    public String toXMLRecord()
    {
        String retString = "";

        retString = "<Person>" + "<ID>" + this.ID + "</ID>";
        retString += "<firstName>" + this.firstName + "</firstName>";
        retString += "<lastName>" + this.lastName + "</lastName>";
        retString += "<title>" + this.title + "</title";
        retString += "<birthYear>" + this.birthYear + "</birthYear></Person>";

        return retString;
    }

    //Format that the data could be saved in
    public String toCSVRecord() {
        return  this.ID + ", " + this.firstName + "," + this.lastName + "," + this.title + "," + birthYear;
    }
}