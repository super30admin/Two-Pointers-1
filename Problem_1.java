// Time Complexity : O(n) , n = length of array nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Problem_1 {
	
	 public void sortColors(int[] nums) {
	        int left = 0, right = nums.length -1, curr = 0;
	        while(curr <= right){
	            if(nums[curr] == 0){
	                swap( curr, left, nums);
	                left++;
	                curr++;
	            }else if(nums[curr] == 2){
	                swap( curr, right, nums);
	                right--;
	            }else{
	                curr++;
	            }
	        }
	    }
	    public void swap(int curr, int index, int[] nums){
	        int temp = nums[curr];
	        nums[curr] = nums[index];
	        nums[index] = temp;
	    }
	    
}
