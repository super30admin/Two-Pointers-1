# Time Complexity :  O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        # three pointers: low:red, mid:white, high:blue
        low = mid = 0
        high = len(nums) - 1

        while(mid <= high):
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -=1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1
            else:
                mid += 1

        """
        Do not return anything, modify nums in-place instead.
        """