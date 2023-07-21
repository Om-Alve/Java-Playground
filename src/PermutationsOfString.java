import java.util.ArrayList;

public class PermutationsOfString {
    public static void main(String[] args){
        String str = "abcde";
        System.out.println(permutations(str,""));
    }
    static ArrayList<String> permutations(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> l = new ArrayList<>();
        for(int i = 0 ; i < p.length()+1;i++){
            l.addAll(permutations(up.substring(1),p.substring(0,i) + up.charAt(0) + p.substring(i)));
        }
        return l;
    }
}
