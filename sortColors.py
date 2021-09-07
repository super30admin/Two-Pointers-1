# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        right_0 = 0
        curr = 0
        left_2 = n-1
        while curr <= left_2:
            if nums[curr] == 0:
                nums[right_0],nums[curr] = nums[curr],nums[right_0]
                right_0 +=1
                curr +=1
            elif nums[curr] == 2:
                nums[curr],nums[left_2] = nums[left_2],nums[curr]
                left_2 = left_2-1
            else:
                curr = curr+1
