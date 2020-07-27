class Solution:
    def sortColors(self, nums: List[int]) -> None:
        #initializing low,mid,high
        low=0
        mid=0
        high=len(nums)-1
        while mid<=high:
            #swapping 0s to the left
            if nums[mid]==0:
                nums[low],nums[mid]=nums[mid],nums[low]
                mid+=1
                low+=1
            #swapping 2s to the right
            elif nums[mid]==2:
                nums[high],nums[mid]=nums[mid],nums[high]
                high-=1
            else:
                mid+=1
                
#Time-Complexity:O(N)
#Space-Complexity:O(1)