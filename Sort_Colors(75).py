# Time Complexity: O(N)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Here we use 3 pointers
# if we find a 2, we swap that with the high pointer and decrement the high as that is sure to be sorted
# if we find a 0, we swap that with the low pointer and move both low and mid
# else if we encounter 1, we just move the mid
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1

        while mid<=high:
            if nums[mid] == 2:
                nums[mid],nums[high] = nums[high], nums[mid]
                high-=1
            elif nums[mid] == 0:
                nums[mid],nums[low] = nums[low],nums[mid]
                low+=1
                mid+=1
            else:
                mid+=1