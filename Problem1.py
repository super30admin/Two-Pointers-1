# Time complexity : O(n)
# Space complexity :O(1)
# Leetcode : Solved and submitted

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        curr = 0
        
        # p0 is the pointer to point to the locations of 0 values and p2 is for value 2, of where we need to place these values
        p0 = 0
        p2 = n-1
        
        # we traverse from the first element until we reach the point where we cannot put more elements of value 2, that is where we end the traversal
        while curr <= p2:
            # if number at curr pointer is 0, then swap values with p0, increment the curr and p0 pointer both
            if nums[curr] == 0:
                nums[curr], nums[p0] = nums[p0], nums[curr]
                p0 += 1
                curr += 1
            # if number at curr pointer is 2, then swap values with p2, only decrement the p2, as we are moving accross the list and need to see all the
            # values
            elif nums[curr] == 2:
                nums[curr], nums[p2] = nums[p2], nums[curr]
                p2 -= 1
            else :
              # if other element, then just increment the curr pointer
                curr += 1
