import java.util.Calendar;

public class Person {

    private String IDNum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;
    static private int IDSeed = 1;
    public Person(String IDNum, String firstName, String lastName, String title, int YOB ){
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;


    }

    public Person(String firstName,String lastName,String title, int YOB ){
        this.IDNum = this.genIDNum();
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;


    }
    //Additionla methods:
    public String getAge(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return  String.valueOf(currentYear - YOB);
    }
    public String getAge(int year){
        return String.valueOf(year - this.YOB);
    }

    public String toCSVDataRecord(){
        return this.IDNum + "," + this.firstName + "," + this.lastName + "," + this.title + "," + this.YOB;
    }

    public String fullName() {
        return this.firstName + "                " + this.lastName;
    }

    public String formalName() {
        return this.title +"                "+ fullName();
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + IDNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }
    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
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

    //Other Getters and Setters:
    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getIDNum() {
        return IDNum;
    }
}
