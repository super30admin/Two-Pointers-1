//Time Complexity: O(n)
//Space Complexity : O(1)
//Code run successfully on LeetCode.

public class Problem1 {

	public void sortColors(int[] nums) {
       
		if(nums == null|| nums.length == 0)
			return;
		
		int low =0;
		int mid =0;
		int high = nums.length - 1;
		
		while(mid <= high) {
			
			if(nums[mid] == 0) {
				swap(nums, low, mid);
				low++;
				mid++;
			}
			
			else if(nums[mid] == 1)
				mid++;
			
			else
			{
				swap(nums,mid,high);
				high--;
			}
		}
    }
	
	public void swap(int[] nums, int l, int r) {
		int temp = nums[l];
		nums[l] = nums[r];
		nums[r] = temp;
	}
}
