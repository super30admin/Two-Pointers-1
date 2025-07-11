'''
75. Sort Colors
Link: https://leetcode.com/problems/sort-colors/

'''

# Time Complexity : O(n) because we traverse the array once.
# Space Complexity : O(1) because we are sorting the array in place without using any extra space.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes, understanding the Dutch National Flag problem approach took some time.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Using the Dutch National Flag problem approach
        '''
        0s -> Red
        1s -> White
        2s -> Blue
        Intuition:
        - We will maintain three pointers:
        - low: to track the position of the next 0
        - mid: to track the current element being processed
        - high: to track the position of the next 2
        '''
        low, mid, high = 0, 0, len(nums) - 1 # humne 3 pointers banaye hain low, mid, high jinko 0, 0, len(nums) - 1 se initialize kiya hai aur inka kaam hai alag alag colors ko alag karna(we have created 3 pointers low, mid, high initialized to 0, 0, len(nums) - 1 respectively and their job is to separate the colors)
        while mid <= high: # jab tak mid high se chhota ya barabar hai tab tak loop chalega(while mid is less than or equal to high, the loop will continue)
            if nums[mid] == 0: # agar current element 0 hai toh hum usse low ke position par rakhna chahte hain(If the current element is 0, we want to place it at the position of low)
                nums[low], nums[mid] = nums[mid], nums[low] # hum low aur mid ke elements ko swap karte hain(we swap the elements at low and mid)
                low += 1 # low ko 1 se badhate hain(we increment low by 1)
                mid += 1 # mid ko bhi 1 se badhate hain(we also increment mid by 1)
            elif nums[mid] == 1: # agar current element 1 hai toh hum ise mid ke position par rakhte hain(If the current element is 1, we keep it at the position of mid)
                mid += 1 # mid ko 1 se badhate hain(we increment mid by 1)
            else: # agar current element 2 hai toh hum ise high ke position par rakhna chahte hain(If the current element is 2, we want to place it at the position of high)
                nums[mid], nums[high] = nums[high], nums[mid] # hum mid aur high ke elements ko swap karte hain(we swap the elements at mid and high)
                high -= 1 # high ko 1 se kam karte hain(we decrement high by 1)
        # At the end of this process, all 0s will be at the beginning,
        # all 1s will be in the middle, and all 2s will be at the end of the array.

# Dry Run Visualization:
# nums = [2, 0, 2, 1, 1, 0]
# Initial state: low = 0, mid = 0, high = 5
# Step 1: nums[mid] = 2, swap with high -> [0, 0, 2, 1, 1, 2], low = 0, mid = 0, high = 4
# Step 2: nums[mid] = 0, swap with low -> [0, 0, 2, 1, 1, 2], low = 1, mid = 1, high = 4
# Step 3: nums[mid] = 0, swap with low -> [0, 0, 2, 1, 1, 2], low = 2, mid = 2, high = 4
# Step 4: nums[mid] = 2, swap with high -> [0, 0, 1, 1, 2, 2], low = 2, mid = 2, high = 3
# Step 5: nums[mid] = 1, increment mid -> [0, 0, 1, 1, 2, 2], low = 2, mid = 3, high = 3
# Step 6: nums[mid] = 1, increment mid -> [0, 0, 1, 1, 2, 2], low = 2, mid = 4, high = 3
# Final state: [0, 0, 1, 1, 2, 2]
# All 0s are at the beginning, all 1s in the middle, and all 2s at the end.
# This approach runs in O(n) time and uses O(1) space.
# This is an efficient solution to the problem of sorting colors in an array.