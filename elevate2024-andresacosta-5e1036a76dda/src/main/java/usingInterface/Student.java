package usingInterface;

public class Student implements Comparable<Student> {

    String firstName;
    String lastName;
    private int iD;

    public Student(String firstName, String lastName, int iD){
        this.firstName = firstName;
        this.lastName = lastName;
        this.iD = iD;



    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getfirstName() {
        return this.firstName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getlastName() {
        return this.lastName;
    }
    public void setiD(int iD) {
        this.iD= iD;
    }

    public int getiD() {
        return this.iD;
    }

        @Override
        public int compareTo(Student o) {
        // compare last names
            // if they are the same compare first names
                // if they have the same first name the objects are equal

            int lastNameComparison = this.lastName.compareToIgnoreCase(o.lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison;
            }

            // 2. If last names are the same, compare first names
            return this.firstName.compareToIgnoreCase(o.firstName);
        }

    }




