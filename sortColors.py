"""
Approach: 
Here we are using 2 pointers(left,mid,right) to iterate over the array.
initially left and middle pointers are initialized at o and right pointer at the end of the array.
we will iterate till mid crosses right.
if nums[mid] = 0, then that should be on the left side. so we swap with nums[left] and increment both left and mid pointers
else if nums[mid] = 2, then that should be on the right side. so we swap with nums[right] and decrement right pointer.
else:  nums[mid] = 1, then it is in correct place. we just increment mid pointer

Time Complexity: O(n)

Space Complexity: O(1)

Passed in Leetcode: Yes

Any difficulties: No

"""
from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> List[int]:
        """
        Do not return anything, modify nums in-place instead.
        """
        left, mid, right = 0, 0, len(nums) - 1
        while(mid <= right):
            if nums[mid] == 0:
                nums[left], nums[mid] = nums[mid], nums[left]
                left += 1
                mid += 1
            elif nums[mid] == 2:
                nums[right], nums[mid] = nums[mid], nums[right]
                right -=1
            else:
                mid += 1
        return nums
sol = Solution()
nums = [2,0,2,1,1,0]
print(sol.sortColors(nums))