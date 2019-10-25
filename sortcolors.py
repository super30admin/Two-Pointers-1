#time complexity:O(n)
#space complexity:O(1)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        i=j=0
        k=len(nums)-1
        while (j<=k):
            if nums[j]==0:
                nums[i],nums[j]=nums[j],nums[i]
                i+=1
                j+=1
            elif nums[j]==2:
                nums[j],nums[k]=nums[k],nums[j]
                k-=1
            else:
                j=j+1
                