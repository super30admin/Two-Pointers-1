class Solution(object):
    def swap(self,nums,a,b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
        
    
    
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        if(len(nums)==0):
            return 0
        
        
        low= 0
        mid = 0
        high = len(nums) -1
        
        while mid<=high:
            
            
            if nums[mid]==1:
                mid+=1
            
            elif nums[mid] ==0:
                self.swap(nums,mid,low)
                low+=1
                mid+=1
            else:
                self.swap(nums,mid,high)
                high-=1
            
#Time - O(n)
#Space - O(1)
        