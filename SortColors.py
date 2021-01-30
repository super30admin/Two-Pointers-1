# TC: O(n)
# SC: O(1)
# LeetCode: Y(https://leetcode.com/problems/sort-colors/)
# Approach: Use three pointers: low <- 0, mid <- 0, high <- len(nums) - 1
#           At any moment, numbers to the left of low will be 0 and numbers to the right of high will be 2
#           Move mid pointer from beginning to high
#               if the number at mid pointer is 0 then swap (nums[low], nums[mid]) and increment low, mid
#                   (The reason above is logical is the algorithm takes care that numbers to left of low are already 0)
#               if the number at mid pointer is 1 then increment need
#                   (The reason no swap is needed above is because 1 is already in the right position)
#               if the number at mid pointer is 2 is then swap (nums[mid], nums[high]) and decrement high
#                   (The reason above os logical is 2 will be placed at its correct position and mid is not incremented because 0 can come from end to the middle because of the swap and incrementing mid now may leave 0 at the wrong psoition)


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, mid, high = 0, 0, len(nums) - 1
        
        while mid <= high:
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
        
