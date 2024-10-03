# 75. Sort Colors
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        n = len(nums)
        low = 0
        mid = 0
        high = n-1

        def swap(nums,i,j):
            nums[i],nums[j] = nums[j],nums[i]

        while(mid<=high):
            if nums[mid] == 2:
                swap(nums,mid,high)
                high -= 1
            elif nums[mid] == 0:
                swap(nums,mid,low)
                low += 1
                mid += 1
            else:
                mid += 1


        
        