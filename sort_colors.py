"""
Problem: Sort colors or Dutch flag
Leetcode: https://leetcode.com/problems/sort-colors/
Solution: Use three pointers, compare, move and swap at appropriate places
Time Complexity: O(n)
Space Complexity: O(1)
"""


class Solution:
    def sort_colors(self, nums):
        # Base case
        if nums is None or len(nums) is 0:
            return

        left = 0
        mid = 0
        right = len(nums) - 1

        while mid <= right:
            if nums[mid] == 0:
                self.swap(nums, mid, left)
                mid += 1
                left += 1
            elif nums[mid] == 1:
                mid += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, right)
                right -= 1
        return nums

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


obj = Solution()
print(obj.sort_colors([2,0,2,1,1,0]))