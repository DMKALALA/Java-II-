import java.util.Calendar;

public class Person {

    private String IDNum = "";
    private String firstName = "";
    private String lastName = "";
    private String title = "";
    private int YOB = 0;

    public Person( String IDNum, String firstName,String lastName,String title, int YOB ){
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;


    }

    public String getIDNum() {
        return IDNum;
    }

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

    public String fullName() {
        return this.firstName + "                " + this.lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String formalName() {
        return this.title +"                "+ fullName();
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
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
}
