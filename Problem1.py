class Solution:    
    def sortColors(self,nums):
        low,mid,high=0,0,len(nums)-1

        while mid<=high:
            if nums[mid]==0:
                nums[low],nums[mid]=nums[mid],nums[low]
                low+=1
                mid+=1
            elif nums[mid]==1:
                mid+=1
            else:
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1
        return nums

sol=Solution()
print(sol.sortColors([2,0,2,1,1,0]))
print(sol.sortColors([2,0,1]))