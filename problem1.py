class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums)-1
        while(mid<=high):
            if nums[mid] == 2:
                self.swap(nums,mid,high)
                high = high - 1

            elif nums[mid] == 1:
                mid = mid + 1

            elif nums[mid] == 0:
                self.swap(nums,mid,low)
                low = low + 1
                mid = mid + 1
    def swap(self,nums,val1,val2):
        nums[val1],nums[val2] = nums[val2],nums[val1]


        
