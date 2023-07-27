'''
Problem: Sort the colors
Time Complexity: O(n), where n is given elements
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        maintained 3 pointers
        if curr is 2 then swap with right
        if curr is 0 then swap with left
        else move curr by 1
'''

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        right = len(nums)-1

        i = 0
        while i <= right:
            if nums[i]==2:
                nums[i], nums[right] = nums[right], nums[i]
                right-=1
            elif nums[i]== 0:
                nums[i], nums[left] = nums[left], nums[i]
                left+=1
                i+=1
            else:
                i+=1