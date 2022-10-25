class Solution:
    def swap(self, i, j, nums):
        nums[i], nums[j] = nums[j], nums[i]
    
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        i, l = 0, 0
        r = len(nums) - 1
        
        while(i<=r):
            if(nums[i]==0):
                self.swap(i,l, nums)
                i += 1
                l += 1
            elif(nums[i] == 2):
                self.swap(i,r, nums)
                r -= 1
            else:
                i += 1