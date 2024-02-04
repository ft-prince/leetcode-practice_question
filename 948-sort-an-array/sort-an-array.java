public class Solution {
    public int[] sortArray(int[] arr) {
        // Call the Sort method to perform merge sort on the input array
        return sort(arr, 0, arr.length - 1);
    }

    // Recursive method to perform merge sort on the array
    public int[] sort(int[] arr, int startIndex, int endIndex) {
        // Base case: If the array has only one element, return an array with that element
        if (startIndex == endIndex) {
            int[] baseArray = new int[1];
            baseArray[0] = arr[startIndex];
            return baseArray;
        }

        // Calculate the mid index of the array
        int midIndex = (startIndex + endIndex) / 2;

        // Recursively sort the left and right halves of the array
        int[] leftSorted = sort(arr, startIndex, midIndex);
        int[] rightSorted = sort(arr, midIndex + 1, endIndex);

        // Merge the sorted left and right halves
        return merge(leftSorted, rightSorted);
    }

    // Merge two sorted arrays into a single sorted array
    public static int[] merge(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and merge them in sorted order
        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the first array
        while (i < length1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the second array
        while (j < length2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        // Return the merged and sorted array
        return mergedArray;
    }
}
