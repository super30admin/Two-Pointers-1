package day12_TwoPointers1;

/*     Standard counting sort approach
Idea : 1. Make a new array of size 3, and increase the count of index 0, 1, 2 according to 
		  element values in nums array
	   2. Place numbers 0, 1, 2 in nums array according to the values of temp array indexes 
Time Complexity : O(n) where n is the number of heights in array
Space Complexity : O(1) since constant space is used.
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no
*/

public class SortColours {
	public void sortColors(int[] nums) {
		
		int[] count = new int[3];
		
		for(int i : nums) {
			count[i]++;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(i < count[0]) {
				nums[i] = 0;
			}
			else if(i < (count[0] + count[1])) {
				nums[i] = 1;
			}
			else nums[i] = 2;
		}
		
 
    }
	
	
	/*
	 public void sortColors(int[] nums) {
        int lt = 0, i = 0, gt = nums.length - 1;
        while (i <= gt) {
            if (nums[i] == 0) {
                swap(nums, lt++, i++);
            } else if (nums[i] == 2) {
                swap(nums, i, gt--);
            } else { // nums[i] == 1
                i++;
            }
        }
    }
    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

	 */
	
//	public static void main (String[] args) {
//		int[] arr = {2, 0, 2, 1, 1, 0};
//		int[] result = sortColors(arr) ;
//		System.out.print(result);
// 	}
}
