import java.util.*;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> sub: ans) {
        System.out.println(sub);
        }
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal = new  ArrayList<>(outer.get(j));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
