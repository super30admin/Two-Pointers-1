//Leetcode Problem : https://leetcode.com/problems/3sum/
// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * I sort the array first. I traverse from i = 0 to i = nums.length-3 and set temp as nums[i]. For every iteration, 
 * I set j = i+1 and k = nums.length-1 and iterate while j<k. If temp+nums[j]+nums[k]==0, I add them to a temporary list
 * and add the list to final ArrayList. If it sums up to less than 0, I increment j else I decrement k.
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int temp = nums[i];
            
            int j=i+1,k=nums.length-1;
            while(j<k)
            {
                List<Integer> arr = new ArrayList<>();
                if(temp+nums[j]+nums[k]==0)
                {
                    arr.add(temp);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    ans.add(arr);
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
                else if(temp+nums[j]+nums[k]<0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return ans;
    }
}