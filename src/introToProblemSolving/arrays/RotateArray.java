package introToProblemSolving.arrays;

// idea is that
// index + k % arr.length -> to find rotation result
// then use swap


/*  Analysis
 7
 1 2 3 4 5 6 7
 0 1 2 3 4 5 6
 3

 1 2 3 4 5 6 7
 7 1 2 3 4 5 6  --- 1
 6 7 1 2 3 4 5  ---- 2
 5 6 7 1 2 3 4  ------- 3  ans

 5 6 7 1 2 3 4


 1 2 3 4 5 6 7
 0 1 2 3 4 5 6

 7 1 2 3 4 5 6  ==> 6 -> 0 , 0 -> 1 , 1 -> 2 , 2 -> 3 , 4 -> 5 , 5 -> 6  ==> k =1
 0 1 2 3 4 5 6

 6 7 1 2 3 4 5 ==> 6 -> 0 , 0 -> 1 , 1 -> 2 , 2 -> 3 , 4 -> 5 , 5 -> 6  ==> k = 2

 5 6 7 1 2 3 4 ==> 6 -> 0 , 0 -> 1 , 1 -> 2 , 2 -> 3 , 4 -> 5 , 5 -> 6  ==> k = 3
 0 1 2 3 4 5 6 ==>


 after k = 3 : 0 -> 3 , 1 -> 4 , 2 -> 5 , 3 -> 6 , 4 -> 0 , 5 -> 1 , 6 -> 2

 left  = 0
 k = 3

 temp = arr[left];
 swapIndex = ( left + 3 ) % arr.length;
 arr[left] = arr[left + 3];
 arr[left + 3] = temp;

 3 % 7 = 3
 4 % 7 = 4
 5 % 7 = 5
 6 % 7 = 6
 7 % 7 = 0
 8 % 7 = 1
 9 % 7 = 2

 */
public class RotateArray {


    public void rotateRightArrayByK(int[] arr, int k) {

        k = k % arr.length; // to calculate the effective rotation

        // reverse the array

        reverse(arr , 0 , arr.length -1);

        // reverse the first half of array till kth - 1 index

        reverse(arr,0 , k-1);

        // reverse the second half
        reverse(arr,k , arr.length -1);
    }

    private void reverse(int[] arr, int i, int j) {

        int left = i;
        int right = j;

        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
}
