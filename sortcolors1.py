// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        res=[]
        l=0
        h=len(nums)-1
        mid=0
        while(mid<=h):
            if(nums[mid]==1):
                mid+=1
            elif nums[mid]==0:
                nums[mid],nums[l]=nums[l],nums[mid]
                mid+=1
                l+=1
            else:
                nums[mid]==2
                nums[mid],nums[h]=nums[h],nums[mid]
                h-=1
