# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : 50% success run
# // Any problem you faced while coding this : Edge cases


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        if len(nums)==1:
            return
        
        
        
        zero = 0
        two = len(nums)-1
        i=0
        for i in range(len(nums)-1):
            
            if(nums[i]==2):
                if(nums[two]==2):
                    while(two>i and nums[two]==2):
                        two=two-1
                nums[i]=nums[two]
                nums[two]=2
                two-=1
            
            elif(nums[i]==0):
                if(nums[zero]==2):
                    while(zero<i and nums[zero]==0):
                        zero=zero+1
                nums[i]=nums[zero]
                nums[zero]=0
                zero+=1
                
            
        
        