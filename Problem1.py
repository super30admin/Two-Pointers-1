# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: sort-colors

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len (nums)
        low, mid, high = 0, 0, n -1

        while mid <= high:
            if nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            elif nums[mid] == 0:
                self.swap(nums, mid, low)
                low += 1
                mid += 1
            else:
                mid += 1
                
    def swap(self, nums, n1, n2):
        temp = nums[n1]
        nums[n1] = nums[n2]
        nums[n2] = temp
