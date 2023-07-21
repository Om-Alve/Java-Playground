public class PatternsWithRecursion {
    public static void main(String[] args) {
        int n=4;
        HalfPyramid(n,0);
    }

    private static void HalfPyramid(int r,int c) {
        if(r==0){
            return;
        }
        if(c<r){
            System.out.printf("* ");
            HalfPyramid(r,c+1);
        }
        else{
            System.out.println();
            HalfPyramid(r-1,0);
        }
    }
}
