class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        In this we will be using two pointer approach, taking three pointer low, mid and high.
        Time Complexity : O(n)
        Space Complexity : O(1)
        """
        if len(nums) == 0: return 0
        
        l,r = 0, len(nums) - 1
        mid = 0
        while mid <= r:
            if nums[mid]==2:
                nums[mid],nums[r] = nums[r], nums[mid]
                r -=1
            elif (nums[mid] ==0):  
                nums[mid],nums[l] = nums[l], nums[mid]
                l += 1
                mid += 1
            elif (nums[mid]==1):
                mid += 1