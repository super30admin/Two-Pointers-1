#Approach
# Maintain 3 points for each color
# start low, mid from start if nums[mid]==2 swap mid with high and decrease high else increase low and mid

#Complexities
#Time Complexity: O(N)
# space Complexity: O(1)

from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:

        low = 0
        mid = 0
        high = len(nums) - 1

        while (mid <= high):
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1
            else:
                mid += 1

