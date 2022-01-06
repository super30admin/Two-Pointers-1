# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        p0 = 0 #low pointer
        p2 = len(nums) -1 #high pointer
        mid = 0 #mid pointer i.e. current pointer
        
        while mid <= p2: 
            if nums[mid] == 2:
                nums[mid], nums[p2] = nums[p2], nums[mid] #swap
                p2 = p2 - 1 #decrement high 
                
            elif nums[mid] == 0:
                nums[p0], nums[mid] = nums[mid], nums[p0] #swap
                p0 = p0 + 1 #increment low
                mid = mid + 1 #because from low side we will not get a 0 so we are incrementing mid
                
            else: #condition if mid == 1
                mid = mid + 1