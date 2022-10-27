class Solution:
    # leetcode URL : https://leetcode.com/problems/sort-colors/
    # Problem : 75. Sort Colors
    # Time Complexity : O(n)
    # Space Complexity : O(1)
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lp = 0
        rp = len(nums)-1
        
        i = 0
        
        while i<=rp:
            if nums[i] == 0:
                self.swap(nums,i,lp)
                i = i+1
                lp = lp+1
            elif nums[i] == 1:
                i = i+1
            elif nums[i] == 2:
                self.swap(nums,i,rp)
                rp = rp-1
            
            
    def swap(self,nums,a,b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp