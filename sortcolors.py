class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        
        """
        
        p0 = 0
        curr = 0
        p2 = len(nums) - 1
        
        while curr<=p2:
            if nums[curr]  == 2:
                
                nums[curr], nums[p2] = nums[p2], nums[curr]
                p2 = p2 - 1
                
            elif nums[curr] == 0:
                
                nums[curr], nums[p0] = nums[p0], nums[curr]
                p0 = p0 + 1
                curr = curr + 1
                
            else:
                
                curr += 1
