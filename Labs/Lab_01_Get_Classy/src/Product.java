import java.util.Calendar;

public class Product {
    private String IDNum;
    private String name;
    private String Description;
    private double Cost;
    static private int IDSeed = 1;
    public Product(String IDNum, String name, String Description, double Cost ){
        this.IDNum = IDNum;
        this.name = name;
        this.Description = Description;
        this.Cost = Cost;

    }
    public Product(String name, String Description, double Cost ){
        this.IDNum = this.genIDNum();
        this.name = name;
        this.Description = Description;
        this.Cost = Cost;

    }

    //Additional methods:
    public String toCSVDataRecord(){
        return this.IDNum + "," + this.name + "," + this.Description + "," + this.Cost;
    }
    public static void setIDSeed(int IDSeed) {
        Product.IDSeed = IDSeed;
    }
    public static int getIDSeed() {
        return IDSeed;
    }

    public String genIDNum() {
        String newID = "" + IDSeed;
        while (newID.length()<6){
            newID = "0" + newID;
        }
        IDSeed++;
        return newID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "IDNum='" + IDNum + '\'' +
                ", name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", Cost=" + Cost +
                '}';
    }

    //Other getters and setters
    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }


}
