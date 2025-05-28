package introToProblemSolving.hashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

//        int sum = sumOfNumbers(5);

        int powerOfNum = power(2,3);

        System.out.println(powerOfNum);

     }

     // Sum of n natural numbers
     public static int sumOfNumbers(int n){
        if(n ==1) return 1;

        int sum = sumOfNumbers(n -1);

        return sum + n;
     }

     // power of number : TC : O(n)
    public static int power(int a , int n){
        if(n==0) return 1;
        if(n==1) return a;

        return a * power(a,n-1);
    }

    
}
