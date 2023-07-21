package ObjectOrientedProgramming;

public class LambdaCalculator {
    private int calc(int a,int b,Operation op){
        return op.operate(a,b);
    }
    public static void main(String[] args) {
        LambdaCalculator cal = new LambdaCalculator();
        Operation sum = (a,b)->a+b;
        Operation difference = (a,b)->a-b;
        System.out.println(cal.calc(9,60,sum));
    }

}

interface Operation{
    int operate(int a,int b);
}
