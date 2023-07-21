package ObjectOrientedProgramming;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always execute!");
        }
        System.out.println(divide(a,b));
    }
    private static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
