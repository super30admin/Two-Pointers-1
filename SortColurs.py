# Time Complexity : O(N) where N is number of inputs
#Space Complexity : O(1)

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums)-1
        
        while(mid<=high):
            if nums[mid]==1:
                mid+=1
            elif nums[mid] == 2:
                self.swap(nums,mid,high)
                high-=1
            else:
                self.swap(nums,low,mid)
                low+=1
                mid+=1
            
            
        
    def swap(self,nums,low,high):
        temp = nums[high]
        nums[high] = nums[low]
        nums[low] = temp
        
            
