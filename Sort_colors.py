// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach: using count variable



class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count_0 = 0
        count_1 = 0
        count_2 = 0
        for i in range(0,len(nums)):
            if nums[i]==0:
                count_0+=1
            if nums[i]==1:
                count_1+=1
            if nums[i]==2:
                count_2+=1
        nums[0:count_0] = [0]*count_0
        nums[count_0:count_1+count_0] = [1]*count_1
        nums[count_0+count_1:] = [2]*count_2
        
