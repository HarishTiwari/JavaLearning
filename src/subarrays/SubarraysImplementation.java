package subarrays;

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
}
