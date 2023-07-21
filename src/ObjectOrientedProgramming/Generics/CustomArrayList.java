package ObjectOrientedProgramming.Generics;

import java.util.ArrayList;
import java.util.Objects;

public class CustomArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=5;

    private int size = 0;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(this.isFull()){
            this.resize();
        }
        this.data[size++] = num;
    }

    public int size(){
        return this.size;
    }
    private boolean isFull(){
        return this.data.length == size;
    }

    private void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        this.data = temp;
    }

    public T get(int index){
        return (T)data[index];
    }
    public void set(int i,T num){
        data[i] = num;
    }

    public void printArrayList(){
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        CustomArrayList<Integer> arr = new CustomArrayList();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        System.out.println(arr.get(0).getClass());
        arr.printArrayList();
    }
}
