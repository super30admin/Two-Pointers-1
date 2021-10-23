# 75. Sort Colors
# https://leetcode.com/problems/sort-colors/

# Time complexiety: O(n)
# Space complexiety: O(1)

class Solution:
    def _helper(self,nums,r,tar):
        left = 0
        right = r

        while left <= right:
            if nums[left] == tar:
                nums[left], nums[right] = nums[right], nums[left]
                right -= 1
            else:
                left += 1
        
        return nums,right

    def sortColors(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        nums, right = self._helper(nums,len(nums) - 1,2)        
        nums, right = self._helper(nums,right,1)
        print(nums)

obj = Solution()
obj.sortColors([1,0,1,2,2,1])
obj.sortColors([2,0,2,1,1,0])
obj.sortColors([1])