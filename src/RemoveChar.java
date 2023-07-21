public class RemoveChar {
    public static void main(String[] args) {
        String str = "abababacacac";
        removeChar(str,"",'a');
        System.out.println(rmchar(str,'a'));
    }

    private static String rmchar(String str, char ch) {
        if(str.length()==0){
            return "";
        }
        if(ch!=str.charAt(0)){
            return str.charAt(0) + rmchar(str.substring(1),ch);
        }
        else {
            return rmchar(str.substring(1),ch);
        }
    }

    private static void removeChar(String str, String ans,char ch) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.charAt(0) != ch){
            removeChar(str.substring(1),ans+str.charAt(0),ch);
        }
        else{
            removeChar(str.substring(1),ans,ch);
        }
    }
}
