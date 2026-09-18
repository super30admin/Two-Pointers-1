# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
#I have used two pointer approach using left and right pointers and i to collect all 0s in left, 1s in i and 2s in right
#If we encounter 2 then we swap i and right and if we encounter 0 then left and i and for 1 we just move further

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if len(nums) == 1:
            return nums
        left = 0
        i = 0
        right = len(nums)-1
        while i <= right:
            if nums[i] == 2:
                self.swap(nums, i, right)
                right -= 1
            elif nums[i] == 0:
                self.swap(nums, i, left)
                left += 1
                i += 1
            else:
                i += 1

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


        