package ObjectOrientedProgramming;

public class Lecture1 {
    public static void main(String[] args) {
        Student om = new Student("Om Alve",18);
        System.out.println(om.name);
        System.out.println(om.rollNo);
    }
}
class Student{
    int rollNo;
    String name;
    Student (String n,int r){
        this.name = n;
        this.rollNo = r;
    }
}
