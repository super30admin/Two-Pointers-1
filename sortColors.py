# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Use three pointers, l tracks position for next 0, h tracks position for next 2, m scans the array.


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        m = 0
        h = len(nums) - 1

        while m <= h:
            
            if nums[m] == 2:
                temp = nums[m]
                nums[m] = nums[h]
                nums[h] = temp
                h -= 1
            elif nums[m] == 0:
                temp = nums[m]
                nums[m] = nums[l]
                nums[l] = temp
                l += 1
                m += 1
            else:
                m += 1
        