// Time Complexity :o(ncube)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : no
// Any problem you faced while coding this : yes did not identify we need 2 pointers, id not know how to use pointers.


// Your code here along with comments explaining your approach : tried the bruteforce method

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++){
                 if(nums[i]+nums[j]+nums[k]==0)
                     result.add(nums[i],nums[j],nums[k]);
                }
            }
        }
        return result;
    }
    
}