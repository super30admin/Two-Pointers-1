import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(nlogn + n^2) = O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * I sorted the array first and ran an outer loop from i = 0 to i = nums.length-3. For each i, I first check for inner duplicates
 * and assign first = nums[i]. Now I set j to i+1 and k to nums.length-1. If first+nums[j]+nums[k] adds up to 0, I add first,
 * nums[j] and nums[k] to resultant array list. If it's greater than 0, I decrement k else I increment j.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int first = nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                if(first+nums[j]+nums[k]==0)
                {
                    ans.add(Arrays.asList(first,nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1])
                    {
                        k--;
                    }
                }
                else if(first+nums[j]+nums[k]>0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }

        return ans;
    }
}