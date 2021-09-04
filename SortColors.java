// Time Complexity : O(n) where n is number of elements in given array
// Space Complexity : O(1) no auxilary data structure used for processing
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : could not get the separate the swap method working

class SortColors {
    public void sortColors(int[] nums) {
        // 0 = red, 1 = white, 2 = blue also, called as Dutch Flag problem
        // null check
        if(nums.length == 0 || nums == null) return;
        
        //3 pointers
        int low = 0;
        int mid = 0; 
        int high = nums.length - 1; 
        
        //since there are ONLY 3 possible numbers 2 has to be at/close to high pointer
        
        while(mid <= high) {
            if( nums[mid] == 0 ) {
                //swap(nums[mid], nums[low]); 
                nums[mid] = nums[low];
                nums[low] = 0; //updating low with 0s
                low++;
                mid++;
            }
            else if( nums[mid] == 2 ) { 
                //swap(nums[mid], nums[high]); 
                nums[mid] = nums[high];
                nums[high] = 2; //updating high with 2s
                high--;
            }
            else {
                mid++; //if it is neither 0 nor 2, it will be 1, just moving the mid pointer ahead
            }
        }
        
    }
    
    // private void swap(int x, int y) {
    //     int temp = x;
    //     x = y;
    //     y = temp;
    // }
}