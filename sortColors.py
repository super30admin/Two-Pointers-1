# Time Complexity: O(n) n -> length of input array
# Space Compleixty: O(1), not using any extra space, just modifying input array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

# We take three points low and mid at starting element and high at last element
# We iterate the array using mid and if mid == 0, swap mid with low
# If mid == 2 swap with high or if mid == 1 just increment mid (continue)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
        return nums