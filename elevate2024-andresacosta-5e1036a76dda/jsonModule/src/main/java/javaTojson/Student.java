package javaTojson;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private int fees;
    private int marks;

    public Student(String firstname, String lastname, int age, int fees, int marks) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.fees = fees;
        this.marks = marks;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
