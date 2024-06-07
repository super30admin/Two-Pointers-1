# Time O(N)
# Space O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left, mid, right = 0, 0, len(nums) - 1
        while mid <= right:
            if nums[mid] == 2: # move right
                nums[mid], nums[right] = nums[right], nums[mid]
                right -= 1
            elif nums[mid] == 0: # move left
                nums[mid], nums[left] = nums[left], nums[mid]
                left += 1
                mid += 1
            else: # move mid
                mid += 1
        return nums
        