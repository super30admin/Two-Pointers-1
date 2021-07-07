/**
 * Single Pass Algorithm
 * Time: O(n)
 * Space: O(1)
 * Leetcode accepted yes
 */
public class SortColours {
	public static int[] sortColors(int[] nums) {
		int lo=0, hi=nums.length-1, mid = 0;
		//Terminating condition: Since mid is increasing, there might come a condition where mid exceeds the last index
		while(mid<=hi) {
			System.out.println("mid: " + mid);
			//If mid element is 0, swap it with low element
			if(nums[mid] == 0) {
				swap(nums, lo, mid);
				// After the swap, both mid and low pointers are at their correct position, so increment both of them
				lo++;
				//It is always 0 or 1 to left of middle, so after a swap mid comes to the correct element
				mid++;
			//If mid element is 1, no need to swap. It implies mid is at its correct position. so increment it
			} else if(nums[mid] == 1) {
				mid++;
			//If mid element is 2, swap it with high element	
			} else {
				//Place 2 at its right position, i.e., high
				swap(nums, mid, hi);
				hi--;
			}
		}
		return nums;
	}
	
	private static void swap(int[] nums, int lo, int hi) {
		int temp = nums[lo];
		nums[lo] = nums[hi];
		nums[hi] = temp;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		int[] res = sortColors(nums);
		for(int i:res) {
			System.out.println(i);
		}
	}

}
