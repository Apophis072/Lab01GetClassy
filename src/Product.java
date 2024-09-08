public class Product
{
    private String ID;
    private String name;
    private String description;
    private double cost;

    public Product(String ID, String name, String description, double cost)
    {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    //Pulls and displays the ID of a Product
    public String getID()
    {
        return ID;
    }

    //Changes the ID of a Product based on input
    public void setID(String ID)
    {
        this.ID = ID;
    }

    //Pulls and displays the name of a Product
    public String getName()
    {
        return name;
    }

    //Changes the name of a product based on input
    public void setName(String name)
    {
        this.name = name;
    }

    //Pulls and displays the description of a Product
    public String getDescription()
    {
        return description;
    }

    //Changes the description of a Product based on input
    public void setDescription(String description)
    {
        this.description = description;
    }

    //Pulls and displays the cost of a Product
    public double getCost()
    {
        return cost;
    }

    //Changes the cost of a Product based on input
    public void setCost(double cost)
    {
        this.cost = cost;
    }

    @Override
    //Format that the data could be saved in
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", Cost=" + cost +
                '}';
    }

    //Format that the data could be saved in
    public String toJSONRecord()
    {
        String retString = "";
        char DQ = '\u0022';  // Assign the double quote char to a variable
        retString =  "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "Name" + DQ + ":" + DQ + this.name + DQ + ",";
        retString += " " + DQ + "Description"  + DQ + ":" + DQ + this.description + DQ + ",";
        retString += " " + DQ + "Cost" + DQ + ": " + DQ + this.cost + DQ + "}";

        return retString;
    }

    //Format that the data could be saved in
    public String toXMLRecord()
    {
        String retString = "";

        retString = "<Product>" + "<ID>" + this.ID + "</ID>";
        retString += "<Name>" + this.name + "</Name>";
        retString += "<Description>" + this.description + "</Description>";
        retString += "<Cost>" + this.cost + "</Cost";

        return retString;
    }

    //Format that the data could be saved in
    public String toCSVRecord() {
        return  this.ID + ", " + this.name + "," + this.description + "," + this.cost;
    }
}
