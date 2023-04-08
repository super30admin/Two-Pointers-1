# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
  
  
"""
Create 3 pointers having low and mid at 0 index and high at n-1 index.
If mid is equal to 1 then increase the mid index, if mid is 0 then swap low and mid element and increase mid and low index, if mid is 2 then swap mid and high and decrease high index
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1

        while mid <= high:

            if nums[mid] == 1:
                mid += 1

            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                mid+=1
                low+=1

            else:
                nums[mid],nums[high] = nums[high],nums[mid]
                
                high -=1        
            

