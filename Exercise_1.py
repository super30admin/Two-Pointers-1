
## Problem1 (https://leetcode.com/problems/sort-colors/)
# Time complexity - O(n)
# Space complexity - O(1)

from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        low = 0
        high = len(nums)-1
        mid = 0

        while (mid <= high):
            if nums[mid] == 2:
                temp = nums[high]
                nums[high] = nums[mid]
                nums[mid] = temp
                high -= 1
            elif nums[mid] == 0:
                temp = nums[low]
                nums[low] = nums[mid]
                nums[mid] = temp
                low += 1
                mid +=1
            else:
                mid +=1
        print(nums)


if __name__ == "__main__":
    solObj = Solution()
    nums = [2,0,2,1,1,0]
    solObj.sortColors(nums)