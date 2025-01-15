# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if not nums or len(nums) == 0:
            return
        
        left, right = 0, len(nums) - 1
        mid = 0

        while mid<=right:
            if nums[mid] == 2:
                self.swap(nums, mid, right)
                right -= 1
            elif nums[mid] == 0:
                self.swap(nums, mid, left)
                left += 1
                mid += 1
            else:
                mid += 1

    def swap(self, nums: List[int], i: int, j: int) -> None:       
        nums[i], nums[j] = nums[j],nums[i]