# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        left, mid = 0, 0
        right = len(nums) - 1

        while mid <= right:
            # if nums[mid] == 2 then swap with right. right becomes sorted
            if nums[mid] == 2:
                nums[mid], nums[right] = nums[right], nums[mid]
                # right is sorted
                right -= 1

            elif nums[mid] == 0:
                # 0 should be in beginning. increment low
                nums[mid], nums[left] = nums[left], nums[mid]
                left += 1
                mid += 1
            else:
                # middle should contain 1's. so move on
                mid += 1
