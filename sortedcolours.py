#https://leetcode.com/problems/sort-colors/
#time-o(n)
#space-o(1)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
            
        l=m=0
        h=len(nums)-1
        while m<=h:
            if nums[m]==0:
                nums[l],nums[m]=nums[m],nums[l]
                l+=1
                m+=1
            elif nums[m]==1:
                m+=1 
            else:
                nums[h],nums[m]=nums[m],nums[h]
                h-=1
                
        