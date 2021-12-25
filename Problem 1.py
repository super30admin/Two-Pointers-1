# Space: O(1)
# Time:O(n)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        l = 0
        r = len(nums) - 1
        mid = 0
        while mid<=r:
            if nums[mid] ==0:
                temp = nums[l]
                nums[l] = nums[mid]
                nums[mid] = temp
                l += 1
                mid += 1
            elif nums[mid] ==2:
                temp = nums[r]
                nums[r] = nums[mid]
                nums[mid] = temp
                r -= 1
            else:
                mid += 1
        return nums
                
            
            
        
