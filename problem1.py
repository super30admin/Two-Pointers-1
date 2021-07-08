class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low=cur=0
        high=len(nums)-1
        while(cur<=high):
            if nums[cur]==0:
                nums[low],nums[cur]=nums[cur],nums[low]
                cur+=1
                low+=1
            elif nums[cur]==2:
                nums[high],nums[cur]=nums[cur],nums[high]
                high-=1
            else:
                cur+=1
        return nums
        #Time O(n)
        #Space O(1)
