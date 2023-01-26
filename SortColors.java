// Time Complexity :O(n)
// Space Complexity :O(1)

/*
 * use two pointer method from mid and end if mid is 0 swap it 
 * with low and if it is 2 swap it with high else increment the 
 * mid pointer.
 */

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else{
                mid++;
            }
        }
    }

    public void swap(int[] nums,  int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}