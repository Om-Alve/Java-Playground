package CollegeLectures;

public class Pgm17 {
    public static void main(String[] args) {
        Addition adder = new Addition();
        adder.add(5,6);
        Subtraction subtractor = new Subtraction();
        subtractor.sub(24,15);
    }
}


class Addition{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class Subtraction{
    public void sub(int a,int b){
        System.out.println(a-b);
    }
}