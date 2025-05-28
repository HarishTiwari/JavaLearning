package introToProblemSolving.generics;

public class Main {

    public static void main(String[] args) {
//        CustomArrayList list = new CustomArrayList();
    //    CustomGenArrayList<Integer> list = new CustomGenArrayList<Integer>();

        WildCardArrayList<Number> list = new WildCardArrayList<>();

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);

        System.out.println(list);
        list.getList(list);
    }
}
