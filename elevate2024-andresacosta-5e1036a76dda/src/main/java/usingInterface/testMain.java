package usingInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testMain {
    public static void main(String[] args) {

        List<Student> Students = new ArrayList<Student>();
        Students.add(new Student("Alice", "Smith", 199));
        Students.add(new Student("Bob", "Johnson", 200));
        Students.add(new Student("Charlie", "Smith", 201));
        Students.add(new Student("Mad", "Max",202));
        Student s1 = new Student("Alice", "Smith", 199);
        Student s2 = new Student("Bob", "Johnson", 200);
        Student s3 = new Student("Charlie", " Smith", 201);
        Student s4 = new Student("Mad", "Max", 203);
        s1.compareTo(s2);
        s1.compareTo(s3);
        s2.compareTo(s4);

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s4));

        Collections.sort(Students);
        System.out.println("Sorted names: ");
           for(Student Student: Students){
               System.out.println(Student.getlastName() + ", " +  Student.getfirstName());

           }

    }
}
