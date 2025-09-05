# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Having 3 pointers for each 0, 1 and 2 then we check if mid is equal to 2 then we move it towards high, if its 0
# then move towards left otherwise let it be where it is. 

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        low = 0
        mid = 0
        high = len(nums)-1

        while(mid <= high):
            if (nums[mid] == 2):
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
            elif (nums[mid] == 0):
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            else:
                mid += 1