package ObjectOrientedProgramming;

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Humann om = new Humann("Om",18);
        Humann twin = (Humann)om.clone();
        System.out.println(twin.name + "  " + twin.age);
    }
}
class Humann implements Cloneable{
    String name;
    int age;
    public Humann(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}