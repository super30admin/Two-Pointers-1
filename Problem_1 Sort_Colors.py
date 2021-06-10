# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if nums == None and len(nums) == 0:
            return
        low = 0
        high = len(nums) - 1
        mid = 0
        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums, mid, low)
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                self.swap(nums, mid, high)
                high -= 1
        return

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp





