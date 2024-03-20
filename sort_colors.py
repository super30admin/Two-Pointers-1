# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if(nums is None or len(nums)==0): return
        n = len(nums)
        low = 0
        mid = 0
        high = n-1

        while(mid <= high):
            if(nums[mid]==0):
                self.swap(nums, low, mid)
                low+=1
                mid+=1
            elif(nums[mid] == 2):
                self.swap(nums, mid, high)
                high-=1
            else:
                mid+=1
        return nums
                
    
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

sc = Solution()
nums = [1,0,2,0,0,1,1,2,2]
print(sc.sortColors(nums))

        