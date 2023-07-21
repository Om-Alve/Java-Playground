import java.util.Scanner;
public class BinaryArithmetic {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
//        int[] a = {0,0,1,0,0,0,1,0}; // 100010
//        int[] b = {0,0,1,0,0,0,1,1}; //
        //00011010 26
        int[] ans={0,0,0,0,0,0,0,0};
        int carry;
        for (int i = a.length()-1; i > 0;i--) {
            if(ans[i]+(int)(a.charAt(i)-'0')+(int)(b.charAt(i)-'0')==1){
                ans[i]=1;
            }
            else if(ans[i]+(int)(a.charAt(i)-'0')+(int)(b.charAt(i)-'0')==2){
                ans[i]=0;
                ans[i-1]=1;
            }
            else if(ans[i]+(int)(a.charAt(i)-'0')+(int)(b.charAt(i)-'0')==3){
                ans[i]=1;
//                ans[i-1]=1;
            }
        }
        System.out.println();
        System.out.println("----------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
}
