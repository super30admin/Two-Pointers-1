'''https://leetcode.com/problems/sort-colors/

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
'''

# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0: return
        # using 3 pointers
        low = 0
        mid = 0
        high = len(nums)-1
        
        while mid <= high:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1  
            else:
                mid += 1
            