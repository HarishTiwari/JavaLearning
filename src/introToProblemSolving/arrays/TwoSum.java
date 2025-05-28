package introToProblemSolving.arrays;

public class TwoSum {

    public boolean isTwoSumPairExist(int[] arr, int k){

        for (int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[i] + arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
