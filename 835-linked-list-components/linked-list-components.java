/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
	// helper function to check if the element of our LinkedList matches the element in the array
    public static boolean find(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
			//returning true if it matches
                return true;
            }
        }
		// returning false if itdoesn't  matches any
        return false;
    } 
    // given function
    public int numComponents(ListNode head, int[] nums) {
        int connected = 0;
        int found = 0;
		
		//traversing the linkedlist
        while(head != null){
            if(find(nums, head.val)){
			// if the element of array matched with LinkedList
			//then we will increase our found variable by 1
                found++;
				// whenever we increase our found variable for the first time, it means we got atleast one connected item
                if(found == 1){
                    connected++;
                }
            }
			// Assigning found with 0 is imp because if we didn't found any match then our found variable will increase everytime 
			// And this will never allow the connected variable to increase. 
            else{
                found=0;
            }
            head = head.next;
        }
		//returning the number of count of how many times our found variable increased 
        return connected;
    }
}