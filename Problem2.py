class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == [] or len(nums) == 0:
            return
        
        n = len(nums)
        low = mid = 0
        high = len(nums)-1
        
        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums,low,mid)
                low +=1
                mid +=1
            elif nums[mid] == 2:
                self.swap(nums,mid,high)
                high -=1
            else:
                mid +=1
        
    def swap(self,nums,i,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
