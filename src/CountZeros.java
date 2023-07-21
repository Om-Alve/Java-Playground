public class CountZeros {
    public static void main(String[] args) {
        int n = 10291010;

        System.out.println(countZero(n,0));
    }
    private static int countZero(int n,int counter) {
        if(n==0){
            return counter;
        }
        if(n%10==0){
            return countZero(n/10,counter+1);
        }
        return countZero(n/10,counter);
    }
}
