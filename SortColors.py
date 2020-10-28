#Time Complexity : O(n) where n is the number of elements in the array
#Space Complexity : o(n) where n is the number of elements in the array

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Get counts of all 0, 1 and 2 and store in a hashmap. Iterating through 0-2 place the counts of each in original nums array.

#Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return []

        l, h, m = 0, len(nums)-1, 0

        while m <= h:
            if nums[m] == 1:
                m += 1
            elif nums[m] == 2:
                nums[m], nums[h] = nums[h], nums[m]
                h -= 1
            else:
                nums[l], nums[m] = nums[m], nums[l]
                l += 1
                m += 1
