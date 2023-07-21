public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(roman(1994));
    }

    private static String roman(int n) {
        String ans="";
        int fives = 500;
        int tens = 1000;
        String sym = "MDCLXVI";
        for (int i = 0; n >0 ;) {
            while(n>=tens && n >0){
                n-=tens;
                ans+=sym.charAt(i);
            }
            if(n>=tens-(tens/10) && n >0){
                ans+=sym.charAt(i+1) ;
                ans+=sym.charAt(i);
                n-=tens-(tens/10);
            }
            tens/=10;
            i++;
            while(n>=fives && n >0){
                n-=fives;
                ans+=sym.charAt(i);
            }
            if(n>=fives - tens && n >0){
                ans+=sym.charAt(i+1);
                ans+=sym.charAt(i);
                n-=fives-(tens/10);
            }
            fives/=10;
            i++;
        }
//        while(n>=10){
//            ans+='X';
//            n-=10;
//        }
//        if(n==9){
//            ans+="IX";
//            n-=9;
//        }
//        while(n>=5){
//            ans+="V";
//            n-=5;
//        }
//        if(n==4){
//            ans+="IV";
//            n-=4;
//        }
//        while(n>0){
//                ans+="I";
//                n--;
//        }
        return ans;
    }
}
