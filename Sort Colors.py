class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        l=0
        m=0
        r=n-1

        while m<=r:
            if nums[m]==2:
                nums[r],nums[m]=nums[m],nums[r]
                r=r-1
            elif nums[m]==0:
                nums[l],nums[m]=nums[m],nums[l]
                l=l+1
                m=m+1
            else:
                m=m+1

