package introToProblemSolving.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size=0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {

        int[] temp = new int[2 * data.length];
        for (int i=0 ; i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index , int value){
        data[index] = value;
    }
}
