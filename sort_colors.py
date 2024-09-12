# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. we have 3 pointer low, high, mid.
2. Low, high keeps track of 0,2 and putting them in the right place. Mid is the current position at any given instant
3. If element at current index is zero, swap it with low, and move ahead the low and mid, If elment at mid is 2
swap it with high and move ahead by decrementing high
4. If it is 1, then we are at the right place and move mid(but not low)
'''

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if len(nums) <=1:
            return nums
        
        low = 0
        mid = 0
        high = len(nums) - 1
        
        while(mid <= high):
            
            if nums[mid] == 0:
                #when we encounter a 0, move it to low
                nums[mid], nums[low] = nums[low], nums[mid]                
                mid += 1
                low += 1
                
            elif nums[mid] == 2:
                #when we encounter a 2, move it to high
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
                                
            else:
                mid += 1

        