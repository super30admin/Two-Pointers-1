"""
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        
        result = []
            
        for i in range(len(nums)):
            goto = abs(nums[i])
            if nums[goto - 1] > 0:
                nums[goto - 1] = -1 * nums[goto - 1]
        
        for i in range(0,len(nums)):
            if(nums[i] > 0):
                result.append(i+1)
        
        return result