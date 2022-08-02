// Create a class Student that would contain enrollment No, name,and gender and marks as instance variables 
// and count as static variable which stores the count of the objects  constructors and display(). Implement 
// constructors to initialize instance variables.

import java.util.*;

class Student{
    int rollno = 69;
    String name = "Arpit";
    String gender = "Male";
    int marks = 89;
    static int object = 0;

    Student(){
        object++;
    }
    void display(){
        System.out.println("--------------------");
        System.out.println("rollno = " + rollno);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("marks = " + marks);
        System.out.println(object + " objects created.");
    }
}
public class QuestionSeven {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.display();
    }
}