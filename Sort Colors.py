# Time Complexity :
# O(n)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english

# We are using three pointers here low, mid and high
# Initially low and mid will point to first element and high will point to last element
# We will compare mid with low and high and depending upon values we will move low or mid or high and swap values
# If value at mid is 2, we will swap mid element with high element and decrement high
# If value at mid is 1, we will just incement mid
# If value at mid is 0, we will swap mid element with low element and increment low and mid

# Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums)-1
        
        while (mid<=high):
            if (nums[mid] == 2):
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            elif (nums[mid]==1):
                mid += 1
            elif (nums[mid]==0):
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1