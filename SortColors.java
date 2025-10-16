// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/description/

// Solution 1 => Using 2 iterations

/**
 *  Time Complexity: O(n) + O(n) = O(n)
 * 
 *  Space Complexity: O(1) since we dont take any auxillary space
 */


class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;

        // get all the 0's at start
        while(low < high){ // if not 0,, swap with last pointer and decrement last pointer
            if(nums[low] != 0){ 
                int temp = nums[high];
                nums[high] = nums[low];
                nums[low] = temp;

                high--;
            }else{
                low++;
            }
        }

        int mid = 0;
        high = nums.length - 1;
  
        // get mid index till we get non-zero number
        while(mid < high  && nums[mid] == 0){
            mid++;
        }

        // get all the 1's at mid index position
        while(mid < high){
            if(nums[mid] != 1){ // if not 1, swap with last pointer and decrement last pointer
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp; 

                high--;              
            }else{ // if 1, go ahead
                mid++;
            }
        }
    }
}


/**
 *  Time Complexity: O(n)
 * 
 *  Space Complexity: O(1) since we dont take any auxillary space
 */

// Solution 2 => Using 1 iteration and 3 pointers

class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){

            if(nums[mid] == 0){ // if mid is 0, swap with low
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid] == 2){ // if mid is 2, swap with last indx
                swap(nums, mid, high);
                high--;
            }else{ // if mid is 1, move mid ahead as we always want 1 on mid
                mid++;
            }
        }
    }

    private void swap(int nums[], int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}