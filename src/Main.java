import introToProblemSolving.arrays.TwoSum;
import introToProblemSolving.string.ToggleChar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int size = sc.nextInt();
//        sc.nextLine(); // clear the next line
//        char[] arr = new char[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.next().charAt(0);
//        }

        ToggleChar tc = new ToggleChar();
        System.out.println(tc.toggleChar("Harish"));


//        int index1 = sc.nextInt();
//        int index2 = sc.nextInt();
////
//        swap(arr , index1 , index2);

//        ReverseArray rev = new ReverseArray();
//        rev.reversePartOfArray(arr,1,4);

//        RotateArray rot = new RotateArray();
//        rot.rotateRightArrayByK(arr,3);

//        TwoSum ts = new TwoSum();
//        boolean result = ts.isTwoSumPairExist(arr, index1);

//        System.out.println(result);

//         printing
//        for(int i = 0 ; i < arr.length ; i++){
//
//            System.out.print(arr[i] + " ");
//
//        }
    }

    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}