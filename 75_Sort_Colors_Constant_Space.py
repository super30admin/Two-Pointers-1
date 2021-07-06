# Time Complexity : O(n) [n = length of the input list]
# 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. Iterate over the array with the index pointer
# 2. Keep two pointers start(to place all 0) and end(to place all 1)
# 3. If the current element is 0
#   3.1 Swap the value with start index if the start and curr element index are not same
#   3.2 Increment the start by 1
# 4. If the current element is 1
#   4.1 Increment the index
# 5. If the current element is 0
#   3.1 Swap the value with end index
#   3.2 Decrement the end by 1
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = 0
        start = 0
        end = len(nums)-1
        
        while i <= end:
            if nums[i] == 1:
                i+=1
            elif nums[i] == 0:
                if i == start:
                    i+=1
                else:
                    nums[start], nums[i] = nums[i], nums[start]
                start+=1
            else:
                nums[end], nums[i] = nums[i], nums[end]
                end-=1