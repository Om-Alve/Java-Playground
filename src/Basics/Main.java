package Basics;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(15,2);
        a.display();
        Complex b = new Complex(10,12);
        b.display();
        Complex.add(a,b);
    }

}
class Complex {
    int real;
    int imaginary;
    Complex(int r,int i){
        real = r;
        imaginary = i;
    }
    void display(){
        System.out.println(real+" "+imaginary+"i");
    }
    static void add(Complex a,Complex b){
        int r = a.real+ b.real;
        int i = a.imaginary+ b.imaginary;
        System.out.println(r + " + " + i + "i");
    }
}
