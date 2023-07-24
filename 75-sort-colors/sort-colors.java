class Solution {
    public void sortColors(int[] arr) {

        //Insertion sorting algorithm
// mark first element as sorted
// for each unsorted element X
// 'extract' the element X
// for j = lastSortedIndex down to 0
// if current element j > X
// move sorted element to the right by 1
// break loop and insert X here        
       
         for(int counter=1;counter<arr.length;counter++){
           int val=arr[counter]; 
           int j=counter-1;   //last sorted element index
          while(j>=0&&arr[j]>val){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=val;
         }
    // return nums; 
    }
}