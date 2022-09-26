# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
#TC - O(n)
#SC - O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums) == 0:
            return 
        def swap(i,j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        low = 0
        mid = 0
        high= len(nums)-1
        while mid<=high:
            if nums[mid] == 2:
                swap(mid,high)
                high -= 1
            elif nums[mid] == 0:
                swap(mid,low)
                low += 1
                mid += 1
            else:
                mid += 1