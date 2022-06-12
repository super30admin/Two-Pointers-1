#TC: O(n)
#SC: O(1)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        m=l=0
        h=len(nums)-1
        while(m<=h):
            if nums[m]==1:
                m+=1
            elif nums[m]==0:
                k=nums[m]
                nums[m]=nums[l]
                nums[l]=k
                l+=1
                m+=1
            elif nums[m]==2:
                k=nums[m]
                nums[m]=nums[h]
                nums[h]=k
                h-=1
        return nums

