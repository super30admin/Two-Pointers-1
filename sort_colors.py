'''
Time complexity : O(N)
Space comlexity:O(1)
'''
class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        
        """

        self.nums = nums
        
        low = 0
        mid = 0
        high = len(self.nums) - 1
        
        
        while mid <= high:
            if self.nums[mid] == 0:
                self.nums[mid] ,self.nums[low] = self.nums[low],self.nums[mid]
                low+=1
                mid+=1
            elif self.nums[mid] == 1:
                mid+=1
            elif self.nums[mid] == 2:
                self.nums[mid],self.nums[high] = self.nums[high],self.nums[mid]
                high-=1
                
s = Solution()
s.sortColors([2,0,2,1,1,0])
print(s.nums)       


