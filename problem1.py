#time comp-O(n)
#space comp- O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #count values of each color
        c_0=0
        c_1=0
        c_2=0
        for i in range(0,len(nums)):
            if nums[i]==0:
                c_0=c_0+1
            elif nums[i]==1:
                c_1=c_1+1
            else:
                c_2=c_2+1
        #in place values overwrite with number of 0's 1's and 2's
        nums[:]= [0]*c_0+[1]*c_1+[2]*c_2
        
        
                
        
        
        
