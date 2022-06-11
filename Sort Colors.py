"""
TC: O(n)
SC: O(1
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p0 = 0 
        curr = 0
        p2 = len(nums)-1
        
        while curr <= p2 :
            if nums[curr] == 0:
                nums[curr] , nums[p0] = nums[p0] , nums[curr]
                curr += 1
                p0 += 1
            elif nums[curr] == 2:
                nums[curr] , nums[p2] = nums[p2] , nums[curr]
                p2 -= 1
            else:
                curr += 1
        
