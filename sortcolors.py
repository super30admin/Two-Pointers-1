# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        pivot = 0
        right = len(nums)-1
        
        while(pivot<=right):
            if nums[pivot]==2:
                nums[pivot],nums[right] = nums[right],nums[pivot]
                right-=1
            elif nums[pivot]==1:
                pivot+=1
            else :
                nums[pivot],nums[left] = nums[left],nums[pivot]
                left+=1
                pivot+=1