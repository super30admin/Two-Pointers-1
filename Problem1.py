# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#  We use 3 pointers to mark the boundaries of the three sections in the array
#  and move them accordingly as we swap elements

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        a, b, c = 0, 0, len(nums)-1

        while b <= c:
            if nums[b] == 2:
                nums[b], nums[c] = nums[c], nums[b]
                c -= 1
            elif nums[b] == 0:
                nums[a], nums[b] = nums[b], nums[a]
                a += 1
                b += 1
            else:
                b += 1
        
        return nums

