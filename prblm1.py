class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return
        l=0
        m=0
        h=len(nums)-1
        #till pointer is not invading high space
        while m<=h:
            if nums[m]==0:
                #left and mid exchange
                nums[l],nums[m]=nums[m],nums[l]
                #left set 
                l+=1
                #change to next position
                m+=1
                
            elif nums[m]==1:
                #change to next
                m+=1
                
            else:
                #mid and high exchange
                nums[m],nums[h]=nums[h],nums[m]
                #right position set
                h-=1
        #O(N)
        #O(1)