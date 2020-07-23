/**
 * Time Complexity: O(n*n) where n is the number of elements in the array
 * Space Complexity : O(1) if we are not considering the result array
 * executed on leetcode: yes
 * approach: we take two pointer approach.
 * To make sure the result contains unique triplets, we need to skip duplicate values. It is easy to do because repeating values are next to each other in a sorted array.
 */

import java.util.*;
class sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        if(nums.length<3) return result;
        for(int i=0;i<nums.length-2;++i)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1])) // this makes  sure that we skip duplicate values
            {
                int start = i+1;
                int end = nums.length-1;
                int target = 0-nums[i];
                while(start<end)
                {
                    if(nums[start]+nums[end]==target)
                    {
                        result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                        while(start<end && nums[start]==nums[start+1]) start++; //skipping duplicate values
                        while(start<end && nums[end]==nums[end-1]) end--; //skipping duplicate values
                        start++;
                        end--;
                    }
                    else if(nums[start]+nums[end]<target) start++;
                    else end--;
            }
        }
    }
        return result;
}
public static void main(String[] args) {
    sum obj = new sum();
    int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
    System.out.println(obj.threeSum(nums));
}
}