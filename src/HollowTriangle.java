public class HollowTriangle {
    public static void main(String[] args) {
        int n=10;
        boolean firstStar;
        for(int i=1;i<=n;i++){
            firstStar=false;
            for(int j=1;j<=n+i-1;j++){
                if((!firstStar && j+i>n) || (j==n+i-1) || (i==n)){
                    System.out.print("*");
                    firstStar=true;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
