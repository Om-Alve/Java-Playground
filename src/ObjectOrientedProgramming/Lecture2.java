package ObjectOrientedProgramming;

public class Lecture2 {
    public static void main(String[] args) {
        Human om = new Human("Om",18);
        Human amadeus = new Human("Amadeus",1);
        System.out.println(om.population);
        System.out.println(amadeus.population);
    }
}
class Human{
    String name;
    int age;
    static int population=0;
    public Human(String name, int age){
        this.name=name;
        this.age=age;
        Human.population+=1;
    }

}
