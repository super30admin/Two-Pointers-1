package twoPointers1;

public class SortColors {
	//Time Complexity : O(n), where n is the length of arr - One Pass
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Deciding whether to go with 2 or 3 pointers
	public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        
        while(curr <= right) {
            if(nums[curr] == 2) {
                nums[curr] = nums[right];
                nums[right--] = 2;
            } else if(nums[curr] == 0) {
                nums[curr++] = nums[left];
                nums[left++] = 0; 
            } else {
                curr++;
            }
        }
    }
	
	//Time Complexity : O(n), where n is the length of arr
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public void sortColors1(int[] nums) {
        int zeroes = 0, ones = 0, twos = 0;
        for(int i: nums) {
            if(i == 0)
                zeroes++;
            else if(i == 1)
                ones++;
            else
                twos++;
        }
        
        int idx = 0;
        while(zeroes > 0) {
            nums[idx++] = 0; 
            zeroes--;
        }
        
        while(ones > 0) {
            nums[idx++] = 1; 
            ones--;
        }
        
        while(twos > 0) {
            nums[idx++] = 2; 
            twos--;
        }
    }
}
