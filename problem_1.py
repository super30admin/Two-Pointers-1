#  Problem: https://leetcode.com/problems/sort-colors/description/ 
#  Time Complexity: O(N)
#  Space Complexity: O(1)
#  Approach: I am using three pointers left, mid and right. 
# I am iterating over the array and if I find 0 at mid, I swap it with left 
# and increment left and mid. 
# If I find 2 at mid, I swap it with right and decrement right. 
# If I find 1 at mid, I increment mid. 
# I keep doing this until mid is less than or equal to right. At the end, the array will be sorted.


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        mid = 0
        right = len(nums) - 1
        while mid <= right:
            if nums[mid] == 0:
                nums[left] , nums[mid] = nums[mid] , nums[left]
                left += 1
                mid += 1
            elif nums[mid] == 2:
                nums[right] , nums[mid] = nums[mid] , nums[right]
                right -= 1
            else:
                mid += 1