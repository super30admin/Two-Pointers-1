class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=0
        j=0
        k = len(nums)-1
        while(j<=k):
            if(nums[j]==0 and j>i):
                nums[i],nums[j] = nums[j],nums[i]
                i+=1
            elif(nums[j]==2 and j<k):
                nums[j],nums[k] = nums[k],nums[j]
                k-=1
            else:
                j+=1
