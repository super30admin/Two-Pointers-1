
// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//two pointer approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //output
        List<List<Integer>> output = new ArrayList<>(); 
        //edge case
        if(nums==null || nums.length <=2) return output;
        Arrays.sort(nums);
        
        for(int i = 0 ; i <nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k)
            {
                int currentSum = nums[i]+nums[j]+nums[k];
                if(currentSum==0)
                {
                    output.add(Arrays.asList(nums[i],nums[j],nums[k]));
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
                else if (currentSum<0)
                {
                    j++;
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                }
                else
                {
                    k--;
                    while(j<k && nums[k]==nums[k+1])
                    {
                        k--;
                    }
                }
            }
        }
        return output;
    }
}