package introToProblemSolving.arrays;

public class CountGreaterThanItself {

    public int countGreaterThanItself(int[] arr){
        int count = 0;

        int max = maxOfArray(arr);

        for (int ele : arr){
            if(ele < max)
                count++;
        }

        return count;
    }

    private int maxOfArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}
