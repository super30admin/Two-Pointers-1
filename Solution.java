import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time: O(n)
 * Space: O(1)
 * Leetcode Accepted: yes
 * Problems faced: no
 */
public class Solution {
	 public static List<List<Integer>> threeSum(int[] nums) {
		 //Sort the array inorder to be able to jump the repeated items and perform a twisted binary search
	       	Arrays.sort(nums);
			List<List<Integer>> result = new ArrayList<List<Integer>>();
	
			for(int i=0; i<nums.length-1; i++) {
				//Fix the first element and find the other possible two indices that make up sum to 0
				// If the fixed element is repeated, increment the pointer
				if(i > 0 && nums[i] == nums[i-1]) {
					i = movePointer(1, i, nums);
				}
				int j=i+1; //low pointer
				int k = nums.length-1; //high pointer
				while(j < k) {
					//If sum is 0, create set
					if(nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> set = new ArrayList<Integer>();
						set.add(nums[i]);
						set.add(nums[j]);
						set.add(nums[k]);
						result.add(set);
						//Increment low pointer and decrement high pointer
						j = movePointer(1, j, nums);
						k = movePointer(0, k, nums);
						// If sum is negative increment low pointer
					} else if(nums[i] + nums[j] + nums[k] < 0){
						j = movePointer(1, j, nums);
						// If sum is positive increment high pointer
					} else {
						k = movePointer(0, k, nums);
					}
				}
			}
			return result;
	    }
	    /**
	     * Function to increment or decrement the pointer to jump over the repeated elements
	     * @param dir => 1 to increment and 0 to decrement
	     * @param ptr
	     * @param nums
	     * @return
	     */
	    private static int movePointer(int dir, int ptr, int[] nums) {
	    		//Decrement pointer and return the new pointer to non repetitive element
			if(dir == 0) {
				while(ptr > 0 && nums[ptr] == nums[ptr-1]) {
					ptr--;
				}
				return ptr-1;
			//Increment pointer and return the new pointer to non repetitive element
			} else {
				while(ptr < nums.length-1 && nums[ptr] == nums[ptr+1]) {
					ptr++;
				}
				return ptr+1;
			}
		}
	
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));
	}
}
