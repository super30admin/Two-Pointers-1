'''Time Complexity: O(n)
Space Complexity: O(1)'''
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        #Check if the nums is empty
        if len(nums)==0:
            return None
        #Check if nums contains only 1 element
        if len(nums)==1:
            return nums[0]
        #3 pointers--- l and mid at 0 and high at end
        l=0
        h=len(nums)-1
        mid= 0
        
        #Do while h crosses mid
        while h >= mid:
            #if color is 2 swap with h and update h
            if nums[mid]==2:
                nums[mid], nums[h]=nums[h], nums[mid]
                h-=1
            #if color is 0, swap with l and update l and h
            elif nums[mid]==0:
                nums[mid], nums[l]=nums[l], nums[mid]
                l+=1
                mid+=1
            #if color is one update mid
            elif nums[mid]==1:
                mid+=1
            
                
            
        
