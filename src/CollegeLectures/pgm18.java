package CollegeLectures;

public class pgm18 {
    public static void main(String[] args) {
        float ans = add(8.0f,9.0f);
        System.out.println(ans);
    }
    static int add(int... args){
        int ans = 0;
        for (int arg:
        args) {
            ans+=arg;
        }
        return ans;
    }
    static float add(float a,float b){
        return a+b;
    }
}
