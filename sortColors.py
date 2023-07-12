#TC:O(N)
#SC:O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0 
        r = len(nums)-1
        def swap(i,j):
            nums[i],nums[j] = nums[j],nums[i]
        i=0
        while i<=r:
            if nums[i]==0:
                swap(l,i)
                l+=1
            elif nums[i]==2:
                swap(i,r)
                r-=1
                i-=1
            i+=1
