// Time Complexity: O(N^2)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Approach: 
// 1. Sort the array to handle duplicates efficiently.
// 2. Iterate through each element, using two-pointer technique to find pairs that sum to zero.
// 3. Skip duplicate elements to avoid repeated triplets.

import java.util.*;

public class ThreeSum  {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if( i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            else
            {
                int l = i+1;
                int r = nums.length-1;
                while(l<r)
                {
                    if(nums[i]+nums[l]+nums[r]==0)
                    {
                        List<Integer> add = Arrays.asList(nums[i], nums[l], nums[r]);
                        al.add(add);
                        int x = nums[l];
                        while(x==nums[l] && l<r)
                        {
                            l++;
                        }
                        int y = nums[r];
                        while(y==nums[r] && l<r)
                        {
                            r--;
                        }
                    }
                    else if(nums[i]+nums[l]+nums[r] < 0)
                    {
                        l++;
                    }
                    else
                    {
                        r--;
                    }
                }
            }
        }
        return al;
    }
}