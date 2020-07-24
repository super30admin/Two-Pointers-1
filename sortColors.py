# Leetcode 75. Sort Colors

# Time Complexity :  O(n) where n is the size of the array

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use the middle pointer to visit any element.
# If mid points to zero swap with low  and increment low and mid else if it points to high 
# swap with high and decrement high. If it points to 1 increment mid.

# Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0 
        mid = 0
        high = len(nums)-1
        
        while mid <= high:
            if nums[mid] == 0:
                nums[low],nums[mid] = nums[mid],nums[low]
                low += 1
                mid += 1
            
            elif nums[mid] == 1:
                mid += 1
                
            else:
                nums[mid],nums[high] = nums[high],nums[mid]
                high -= 1