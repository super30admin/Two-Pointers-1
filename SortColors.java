// Time Complexity : O(n). n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length<=1)
	            return;
	        
	        
	        int i = 0;
			int j = nums.length - 1;
			int k = 0;
			while (i <= j && k <= j) {

				while (i<j && nums[i] == 0) {
					i++;k++;
				}
				while (j>0 && nums[j] == 2) {
					j--;
				}

				if (nums[k] == 2 && k<=j) {
					swap(k, j, nums);
					if (nums[k] != 0)
						k++;
					j--;
				} else if (nums[k] == 0) {
					swap(i, k, nums);
					if (nums[k] != 2)
						k++;
					i++;
				} else if (nums[k] == 1)
					k++;

			}
    }
    private void swap(int a, int b, int[] nums) {
		if(a!=b) {
			nums[a] = nums[a] + nums[b];
			nums[b] = nums[a] - nums[b];
			nums[a] = nums[a] - nums[b];
		}
	}
}
