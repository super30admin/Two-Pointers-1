#Time Complexity :o(n)
#Space Complexity :o(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if(nums==None or len(nums)==0):
            return []
        
        low=0
        mid=0
        high=len(nums)-1
        
        while(mid<=high):
            
            if(nums[mid]==1):
                mid+=1
            elif(nums[mid]==2):
                temp=nums[mid]
                nums[mid]=nums[high]
                nums[high]=temp
                high-=1
            elif(nums[mid]==0):
                temp=nums[mid]
                nums[mid]=nums[low]
                nums[low]=temp
                low+=1
                mid+=1
        return nums
                
        