public class Strings {
    public static void main(String[] args) {
        String a = "Om";
        String b = "Om";
        System.out.println(a==b);
        String c = new String("Om");
        String d = new String("Om");
        System.out.println(c.equals(d));
        System.out.println(c.charAt(0));

        float n = 3.142353F;
        System.out.printf("%.2f",n);
        System.out.printf("%f",Math.PI);
    }
}
