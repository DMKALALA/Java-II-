public class Person {
    private String firstName;
    private String lastName;
    private String IDNum;
    private String title;
    private int YOB;
    static private int IDSeed = 1;

    public Person(String firstName, String lastName, String IDNum, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNum = IDNum;
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


    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
    }
    public static int getIDSeed() {
        return IDSeed;
    }

    public String genIDNum() {
        String newID = "" + IDSeed;
        while (newID.length()<3){
            newID = "0" + newID;
        }
        IDSeed++;
        return newID;
    }
    public String toCSVDataRecord(){
        return  getFormalName() +  "," + getIDNum()  +  "," + getYOB();
    }
    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }
    public String getFormalName() {
        return title + "," + firstName + "," + lastName;
    }

    public String getIDNum() {
        return IDNum;
    }

    public int getYOB() {
        return YOB;
    }


    public int getAge() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - YOB;
    }

    public int getAge(int year) {
        return year - YOB;
    }
}