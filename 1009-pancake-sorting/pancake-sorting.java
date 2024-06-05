import java.util.ArrayList;
import java.util.List;

public class Solution {    
    // Function to perform a flip at position k
    private void flip(int[] arr, int k) {
        int left = 0;
        int right = k;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    // Function to find the index of the largest element in the array up to the given index
    private int findMaxIndex(int[] arr, int n) {
        int maxIndex = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    // Function to perform pancake sorting
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int n = arr.length - 1; n > 0; n--) {
            int maxIndex = findMaxIndex(arr, n);
            if (maxIndex != n) {
                // Flip to bring the largest element to the front
                if (maxIndex != 0) {
                    result.add(maxIndex + 1);
                    flip(arr, maxIndex);
                }
                // Flip to bring the largest element to its correct position
                result.add(n + 1);
                flip(arr, n);
            }
        }
        return result;
    }

}
