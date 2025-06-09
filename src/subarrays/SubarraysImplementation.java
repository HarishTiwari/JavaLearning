package subarrays;

import java.util.HashMap;

public class SubarraysImplementation {

    public static void main(String[] args) {

        int[] arr = {5,3,-1,8};
//        printSubarray(arr, 2,5);
//        printAllSubarray(arr);

        subArraySum(arr);
    }

    public static void printSubarray(int[] arr,int start, int end){

        if(end >= arr.length){
            System.out.println("end point is greater than the array length");
            return;
        }
        for (int i= start ; i <=end; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void printAllSubarray(int[] arr){

        for (int i=0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ;j++){
                // printing the subarray

                for (int k=i; k <=j ; k++){
                    System.out.print(arr[k] +  " ");
                }
                System.out.println();
            }
        }
    }

    public static int[] calculatePrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1 ; i < arr.length ; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        return prefixSum;
    }

    public static void subArraySum(int[] arr){

        // calculate prefix sum
        int[] prefixArr = calculatePrefixSum(arr);

        // fetching all subarrays

        for (int i=0 ; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                int sumOfSubarr = 0;
                if (i != 0) {
                    sumOfSubarr = prefixArr[j] - prefixArr[i - 1];
                } else {
                    sumOfSubarr = prefixArr[j];
                }
                System.out.println(sumOfSubarr);
            }
        }

    }

    public int subArraySum(int[] arr , int k){
        // Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int prefixSum = 0 ;

        int count = 0 ;

        for(int num : arr){
            prefixSum += num;

            int target = prefixSum - k;

            if(map.containsKey(target)){
                count += map.get(target);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0) + 1);
        }

        return count;
    }

    public int sumOfAllSubArrays(int[] arr){
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            int occ = (i+1) * (arr.length - i);

            sum += arr[i] * occ;
        }

        return sum;
    }
}
