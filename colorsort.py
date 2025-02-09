#Time Complexity = o(n)
# Space Complexity = o(1)
# Able to run on Leet code: Yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l,r,c = 0,len(nums)-1,0
        while c<=r:
            if nums[c]==0:
                nums[l],nums[c]=nums[c],nums[l]
                l+=1
                c+=1
            elif nums[c]==2:
                nums[c],nums[r]=nums[r],nums[c]
                r-=1
            else:
                c+=1