package Oct29;

class SortColors {
    public void sortColors(int[] nums) {
        
/* 
	Time Complexity: O(n) where n is no.of elements in nums array.
	Because we need to iterate through all elements of nums array.

	Space Complexity: O(1)
	No extra space used, so O(1).
	      
	Did this code successfully run on Leetcode : Yes

	Any problem you faced while coding this : No

	Approach:
	Two pointer approach used. Low and high pointers placed in the array to hold 0 and 2 at their correct position. Through third pointer 'index', array traversal performed.
	  
	*/
        
        // edge
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int len = nums.length;
        int low = 0;
        int index = 0;
        int high = len-1;
        
        // Array traversal performed to check if the current elem is a 0 or 2.
        // If current elem(at index) is 0: exchange that with value at low pointer.
        // If current elem(at index) is 2: exchange that with value at high pointer.
        // If current elem(at index) is 1: no swap. Just increment index.
        /* NOTE:
1) When elem at index is swapped with high, it will be a 2 which will be placed at high after swapping. This 2 will be at its correct position, so we can decrement high.
2) Similarly, when elem at index is swapped with low, it will be a 0 which will be placed at low after swapping. This 0 will be at its correct position, so we can increment low. 
3) Index will be incremented only when swap with low is done and not high because element at index after swap could be a 0 or 1, which may need further processing. So, index should not be incremented to ensure that the new value is also processed. 
        */
        
        while (index <= high) {
            if (nums[index] == 0) {
                // swap function called to exchange elements at low and index 
                swap(nums, low, index);
                low++; 
                index++; 
            } 
            else if (nums[index] == 2) {
                // swap function called to exchange elements at high and index 
                swap(nums, index, high);
                high--;     
            } 
            else {
                index++;
            }
        }  
    }
    
    // helper function for swapping two values in the array
    public void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}