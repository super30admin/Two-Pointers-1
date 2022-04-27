// Time Complexity :O(logn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
public class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 1) return;
        
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    
    public void swap(int[] nums, int src, int des){
        int temp = nums[src];
        nums[src] = nums[des];
        nums[des] = temp;
    }
}
