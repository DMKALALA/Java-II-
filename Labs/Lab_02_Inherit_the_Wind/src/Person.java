import java.time.Year;


public class Person {
    private String firstname;
    private String lastname;
    private String title;
    private String ID;
    private int YOB;

    public Person(String firstname, String lastname, String title, String ID, int YOB) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.ID = ID;
        this.YOB = YOB;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", title='" + title + '\'' +
                ", ID='" + ID + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    /**
     * Method to get the full name from the person object
     * @return return the first and last names as a full name string
     */
    public String getfullname(){
        return firstname + " "+ lastname;
    }

    /**
     * Method to get the formal name from the person object
     * @return return the title, first, and last name as a formal name string
     */
    public String getformalname(){
        return title + " " + firstname + " " + lastname;
    }

    /**
     * Method to get the age as an int assuming that it is for the current year
     * @return the current age
     */
    public int getAge(){
        return Integer.parseInt(Year.now().toString())-YOB;
    }

    /**
     * @param year the year that you want to use to determine the age at that time
     * @return
     */
    public int getAge(int year){
        return year-YOB;
    }

    /**
     *
     * @return Returns object data in CSV format
     */
    public String toCSVRecord(){
        return ID + ", " + firstname + ", " + lastname + ", " + title + ", " + YOB;
    }

}