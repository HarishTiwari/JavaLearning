package introToProblemSolving.generics;

import java.util.Arrays;
import java.util.List;

// T should be either Number or its subclasses
public class WildCardArrayList<T extends Number>{

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size=0;

    public WildCardArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(WildCardArrayList<? extends Number> list){
        System.out.println("List of generics and it subclasses");
    }

    public void add(T num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {

        Object[] temp = new Object[2 * data.length];
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

    public T remove(){
        return (T) data[--size];
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index , T value){
        data[index] = value;
    }
}
