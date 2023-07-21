package ObjectOrientedProgramming;

public class Inheritance {
    public static void main(String[] args) {
    BoxWeight b = new BoxWeight(3,6,9,20);
    b.boxInfo();
    }
}
class Box{
    double h;
    double w;
    double l;

    Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }

    // Cube
    Box(double side){
        this.h=side;
        this.w=side;
        this.l=side;
    }

    Box(double l,double w,double h) {
        this.h=h;
        this.w=w;
        this.l=l;
    }

}

class BoxWeight extends Box{
    double weight;
    BoxWeight(double l,double w,double h,double weight) {
    super(l,h,w);
    this.weight = weight;
    }

    public void boxInfo(){
        System.out.println(this.l+" "+this.w+" "+this.h + " " + this.weight);
    }
}
