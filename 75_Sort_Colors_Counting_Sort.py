# Time Complexity : O(n) [n = length of the input list]
# 
# Space Complexity : O(n)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. Create a map with the values  0, 1 and 2 as keys and their count as values
# 2. Traverse the map and update the nums based in the count
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count_map = collections.Counter(nums)
        index = 0
        for i in range(3):
            for j in range(count_map[i]):
                nums[index] = i
                index+=1