/**
Leetcode 15: 3 SUM

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.


Collabedit: http://collabedit.com/pw6hv

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]


Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

**/

class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
    
        Arrays.sort(nums);
        
        
        
    }
    
    private int[] twoSum(int nums[], int index) 
    {
        
        int output[] = new int[2];
        int start = index;
    
        int end = nums.length -1;
        
        while( end > index)
        {
            int sum = nums[start] + nums[index] + nums[end];
            
            if( sum > 0) {
                end --;
            }
            else if( sum < 0)
            {
                index ++;
            }
            else
            {
                // we found the combination with sum 0
            
            }
        
        }
        
    
    
    }
}