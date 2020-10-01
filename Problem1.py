# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        curr, left, right = 0, 0, len(nums)-1
        while curr <= right:
            if nums[curr] == 0:
                nums[curr], nums[left] = nums[left], nums[curr]
                curr += 1
                left += 1
                
            elif nums[curr] == 1:
                curr += 1

            else:
                nums[curr], nums[right] = nums[right], nums[curr]
                # curr += 1
                right -= 1
            
