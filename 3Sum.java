//sort the array, keep 3 pointers. check 1 element and perform 2 sum on the rest
//Time complexity: O(n^2logn)
//Space complexity: O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(nums);

         for(int i=0;i<nums.length-2;i++)
         {
            if(i>0 && nums[i]==nums[i-1]) continue;

             int j=i+1;
             int k=nums.length-1;
            while(j<k)
            {
                int sum= nums[i]+nums[j]+nums[k];

                if(sum==0)
                {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                
                    while(j<k && nums[j]==nums[j+1])
                    {
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1])
                    {
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(sum<0) j++;
                else k--;
            }
        }
         return ans;

    }
}