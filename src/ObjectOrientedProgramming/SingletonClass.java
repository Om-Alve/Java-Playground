package ObjectOrientedProgramming;

public class SingletonClass {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
    }
}
class Singleton{
    private Singleton(){

    }

    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
            return instance;
        }
        else{
            return instance;
        }
    }
}
