// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * 1. Sort the array and iterate over the array. 
 * 2. For each element, find the two sum of the remaining array and skip the duplicates.
 * 3. For two sum, use two pointers approach and skip the duplicates using while loop.
 * 4. If the sum is 0, add the elements to the result. If sum is greater than 0, decrement the right pointer. 
 * If sum is less than 0, increment the left pointer. 
 * 5. Return the result.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums); // O(nlogn)
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<len;i++){ // O(n)
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1, right = len - 1;
            while(left < right){ // O(n)
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left<right && nums[right] == nums[right-1]){
                        right--;
                    }

                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }

                    left++;
                    right--;

                }else if(sum > 0){
                    while(left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    right--;
                }else {
                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    left++;
                }
            }
        }

        return result;
    }
}

/**
[-4,-1,-1,0,1,2]

[-1,-1,2], []


 */