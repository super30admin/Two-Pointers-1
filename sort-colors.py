# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# find the count of 0,1 and 2 and replace the values in nums with them
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        c = [0,0,0]
        for i in nums:
            if i == 0:
                c[0]+=1
            elif i == 1:
                c[1]+=1
            else:
                c[2] += 1
        i = 0
        k = 0
        count = c[k]
        while i < len(nums):
            if count > 0:
                nums[i] = k
                i+=1
                count -= 1
            else:
                k+=1
                count = c[k]
        
