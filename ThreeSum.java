// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// Use two pointer after sorting the given array.
// Consider one number and apply the two pointers to find other two elements that sum to zero.
// Avoid duplicate numbers to ensure no repeated triplets and return all unique triplets in the result.



import java.util.*;
class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0;i<n-2;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int l=i+1,r=n-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
                else if(sum>0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return result;
    }
}