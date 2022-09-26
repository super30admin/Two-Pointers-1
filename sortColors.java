// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None.


// Your code here along with comments explaining your approach
class Solution {
	public void sortColors(int[] nums) {
		 if (nums == null || nums.length == 0) return;
		 
		 int n = nums.length;
		 
		 int low = 0, mid = 0, high = n-1;
		 
		 while(mid <= high) {
			  if(nums[mid] == 2) {
					swap(nums, mid, high);
					high--;
			  } else if (nums[mid] == 0) {
					swap(nums, mid, low);
					mid++;
					low++;
			  } else {
					mid++;
			  }
		 }
	}
	
	private void swap(int[] arr, int i, int j) {
		 int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
	}
}