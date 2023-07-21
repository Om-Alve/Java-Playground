package ObjectOrientedProgramming.Generics;

import java.util.Arrays;

public class ComparingObjects {
    public static void main(String[] args) {
        Student om = new Student("Om",1);
        Student anuj = new Student("Anuj",2);
        Student sahil = new Student("Sahil",4);
        Student arkan = new Student("Arkan",3);
        Student[] list = {om,arkan,sahil,anuj};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}

class Student implements Comparable<Student>{
    int rollNo;
    String name;
    Student (String n,int r){
        this.name = n;
        this.rollNo = r;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo-o.rollNo;
    }
}
