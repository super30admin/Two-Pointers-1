# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
class Solution:
    def sortColors(self, nums: [int]):
        # edge case
        if not nums or len(nums) == 0:
            return
        low = 0
        mid = 0
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 1:
                mid += 1
            elif nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            else:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1



