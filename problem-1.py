# Leetcode execution : YES
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zero=0
        one=0
        two=0
        # since the question is dealing with 0,1,2 then we count them 
        for x in nums:
            if x==0:
                zero+=1
            elif x==1:
                one+=1
            elif x==2:
                two+=1
        k=0
        # increment index k and place 0's first then 1 and last we put 2 
        while(zero>0):
            nums[k]=0
            k+=1
            zero-=1
        while(one>0):
            nums[k]=1
            k+=1
            one-=1
        while(two>0):
            nums[k]=2
            k+=1
            two-=1
        
                
            
            
            