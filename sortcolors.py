# Time Complexity : O(n) where n is the length of list.
 # Space Complexity : O(1)
 # Did this code successfully run on Leetcode : Yes.
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if (nums == None or len(nums) ==0): return 0
        low = 0 
        high = len(nums) -1
        mid = 0
        while(high>=mid):
            if(nums[mid]==2):
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1
            elif(nums[mid]==0):
                nums[mid],nums[low] = nums[low],nums[mid]
                low+=1
                mid+=1
            else:
                mid+=1
        return nums

            
                
        
        
        
        
        """
        Do not return anything, modify nums in-place instead.
        """
        