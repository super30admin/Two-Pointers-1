class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l = 0
        r = len(nums)-1
        curr = 0
        while curr<=r:
            if nums[curr]==1:
                curr+=1
            elif nums[curr]==0:
                nums[l],nums[curr] = nums[curr],nums[l]
                l+=1
                curr+=1
            else:
                nums[r],nums[curr] = nums[curr],nums[r]
                r-=1
        return nums
                
            
        