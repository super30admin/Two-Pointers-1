# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is create a two pointers l&r and swap it with a mid pointer based on the numbers 0,1,2.   

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l=0
        m=0
        n=len(nums)-1
        if(len(nums)==1):
            return nums[0]
        while(m<=n):
            if(nums[m]==2):
                temp=nums[m]
                nums[m]=nums[n]
                nums[n]=temp
                n-=1
            elif(nums[m]==0):
                temp=nums[m]
                nums[m]=nums[l]
                nums[l]=temp
                l+=1
                m+=1
            else:
                m+=1
        return nums