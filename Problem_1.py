# https://leetcode.com/problems/sort-colors/

# Time complexity: O(n) 
# Space complexity: O(1)
# Explanation: Use 3 pointers, and move every 0 to the left, every 2 to the right, and keep the 1s in the middle;
# while swapping make sure left side swaps increment both p0 and curr pointer because those values have been checked
# but right side swaps increment only p2 because those values have not been checked

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        p0, p2 = 0, n - 1 
        curr = 0
        while curr <= p2:
            if nums[curr] == 0:
                nums[p0], nums[curr] = nums[curr], nums[p0]
                p0 += 1
                curr += 1
            elif nums[curr] == 2:
                nums[p2], nums[curr] = nums[curr], nums[p2]
                p2 -= 1
            else:
                curr += 1

        
