import java.util.Arrays;

//Time: O(nlogn)
//Space: o(1)
//Leetcide : yes- time complexity can be improved
public class SortColors {
	public void sortColors(int[] nums) {
		Arrays.sort(nums);
	}


	//Time: O(n)
	//Space: o(1)
	//Leetcide : yes
	class Solution {
		public void sortColors(int[] nums) {
			if(nums.length==0 || nums == null) return ;
			//3 pointers - low collects 0, nums[mid]==0 , then swap low and mid
			//mid collects 1- nums[mid] ==1 then mid++
			//high collects 2 = nums[mid[ ==2 then swap mid and high
			int low = 0;
			int mid = 0;
			int high = nums.length-1;
			while(mid<=high){
				if(nums[mid]==0){
					swap(nums, low, mid);
					low++;
					mid++;
				}else if(nums[mid] == 1){
					mid++;
				}else if(nums[mid] ==2){
					swap(nums, mid,high);
					high--;
				}}
		}
		//swapping helper
		private void swap(int[] nums, int low, int high){
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
		}
	}
}
