# The code defines a sortColors method to sort an array containing the values 0, 1, and 2 in non-decreasing order.
# This sorting is done in place using a basic comparison approach.

# Initial Setup:
#   - 'lft' is initialized to 0 and will represent the position of the current element being compared.
#   - 'n' is the length of the nums list.

# Main Loop:
#   - The outer loop continues until 'lft' reaches the second-to-last element in the list (n - 1), as all comparisons will be complete by then.
#   - For each position 'lft', an inner loop iterates from 'lft + 1' to the end of the list (n):
#       - If a smaller element is found at 'rgt' (i.e., nums[rgt] < nums[lft]), the values at 'lft' and 'rgt' are swapped.
#       - This ensures that smaller values move to the beginning of the list as the left pointer progresses.
#   - 'lft' is incremented to move to the next position, gradually sorting the list from left to right.

# Note: This method does not use the most efficient approach (such as the Dutch National Flag algorithm) but performs an in-place selection sort.

# Final Result:
#   - After the loops, nums is sorted in non-decreasing order with all 0s at the beginning, followed by 1s, and then 2s.

# TC: O(n^2) - The time complexity is quadratic due to the nested loops.
# SC: O(1) - The space complexity is constant as the sorting is done in place without additional data structures.


from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lft, n = 0, len(nums)
        while lft < n - 1:  
            for rgt in range(lft+1, n):
                if nums[rgt] < nums[lft]:
                    nums[lft], nums[rgt] = nums[rgt], nums[lft]
            lft+=1 