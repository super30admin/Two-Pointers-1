class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l,m, h = 0,0,len(nums)-1
        while m<=h:
            if nums[m] ==2:
                nums[m],nums[h] = nums[h],nums[m]
                h-=1
            elif nums[m]==0:
                nums[m],nums[l] = nums[l],nums[m]
                m+=1
                l+=1
            else:
                m+=1
        