// Write a JAVA program perform following class hierarchy.create a class Employee which contains eid,ename,department.create a class salary which extends employee class and contains eid,salary,no of leave.create a emp_salary class to display the information of employee and its salary details.

import java.util.*;

class Employee{
    static String EId, Ename, Department;
    public static void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee id : ");
        EId = sc.nextLine();
        System.out.print("Enter Employee name : ");
        Ename = sc.nextLine();
        System.out.print("Enter Employee Department : ");
        Department = sc.nextLine();
    }
}

class Salary extends Employee{
    static String Salary;
    static int Leaves;
    public static void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Salary : ");
        Salary = sc.next();
        System.out.print("Enter Employee Leaves : ");
        Leaves = sc.nextInt();
    }
    
    
}

class Emp_Salary extends Salary{
    public static void get(){
        Employee e = new Employee();
        e.getdata();
        Salary s = new Salary();
        s.getdata();
       
    }
    public static void display(){
        System.out.println("Employee id is " + EId);
        System.out.println("Employee name is " + Ename);
        System.out.println("Employee Department is " + Department);
        System.out.println("Employee Salary is " + Salary);
        System.out.println("Employee Leaves is " + Leaves);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Emp_Salary es = new Emp_Salary();
        es.get();
        System.out.println();
        System.out.println();
        es.display();
    }
}