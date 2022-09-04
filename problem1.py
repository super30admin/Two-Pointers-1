'''
75. Sort Colors

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
DIFFICULTIES: Took a while to use three pointers rather than two pointers.
'''


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        l = 0
        r = n-1
        p = 0
        
        while p<r and l < r:
            if nums[r] == 2:
                r -= 1
            elif nums[l] == 0:
                l += 1
            elif nums[p] == 0 and p <= l:
                p += 1
            elif nums[p]  == 1 and nums[r] == 1:
                p += 1
            elif nums[r] < nums[p]:
                nums[r], nums[p] = nums[p], nums[r]
            elif nums[l] > nums[p]:
                nums[l], nums[p] = nums[p], nums[l]
            
                
            
        
        
            
