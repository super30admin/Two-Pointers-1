#  Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        first = curr = 0
        last = len(nums)-1
        
        while( curr <=  last):
            if nums[curr] == 0:
                nums[first], nums[curr] = nums[curr], nums[first]
                first +=1
                curr +=1
            elif nums[curr] == 2:
                nums[last], nums[curr] = nums[curr], nums[last]
                last -=1
            else:
                curr +=1
            