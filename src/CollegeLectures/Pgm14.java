package CollegeLectures;

public class Pgm14 {
    public static void main(String[] args) {
        Employee om = new Employee("Om",100000);
        om.printDetails();
        Employee anuj = new Employee("Anuj",100000);
        anuj.printDetails();
    }
}
class Employee{
    String name;
    static int numberOfEmployees = 0;
    int id;
    int sal;

    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
        numberOfEmployees+=1;
        this.id= numberOfEmployees;
    }

    void printDetails(){
        System.out.println("Name : "+ this.name);
        System.out.println("ID : " + this.id);
        System.out.println("Salary : "+ this.sal);
    }
}
