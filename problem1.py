# Time Complexity : O(N ), 
# Space Complexity : 0(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach



class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums ==None or len(nums)==0:
            return 
        n = len(nums)
        l= 0
        h= n-1
        m=0
        while(m<=h):
            if nums[m] ==0:
                nums[l],nums[m]=nums[m],nums[l]
                l+=1
                m+=1
            elif nums[m]==2:
                nums[h],nums[m]=nums[m],nums[h]
                h-=1
            else:
                m+=1
