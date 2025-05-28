package introToProblemSolving.arrays;

public class ReverseArray {
    public void reverseArray(int arr[]) {

        int last = arr.length - 1;
        for(int i = 0 ; i < arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
        }
    }

    public void reversePartOfArray(int arr[], int index1 , int index2) {

        int left = index1;
        int right = index2;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

