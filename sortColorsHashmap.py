#time complexity: o(n) space complexity: o(n)
from collections import Counter
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        m=Counter(nums)
        result=[]
                 
        for i in range(len(nums)):
            if(m[0]>0):
                nums[i]=0
                m[0]=m[0]-1 
               
                continue
            if(m[1]>0):
               
                nums[i]=1
                m[1]=m[1]-1 
                continue
            if(m[2]>0):
                nums[i]=2
                m[2]=m[2]-1
                continue
        print(nums)
        
