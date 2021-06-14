// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class SortColors {

    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int left = 0; int right = nums.length -1; int mid = 0;
        while (mid <= right){
            if(nums[mid] == 0){
                swap(nums,left,mid);
                left++;mid++;
            } else if(nums[mid] ==2){
                swap(nums, right, mid);
                right--;
            } else {
                mid++;
            }
        } 
    }
    
    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	
}
