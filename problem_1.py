
# Time Complexity - O(n)
# Space Complexity - O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        left = 0
        mid = 0
        right = len(nums)-1 
        while mid <= right:

            for i in range(len(nums)):
                if nums[mid] == 2 :
                    nums[right], nums[mid] = nums[mid],nums[right]
                    right -= 1 
                elif nums[mid] == 0 :
                    nums[left], nums[mid] = nums[mid],nums[left]
                    left += 1 
                    mid += 1 
                else :
                    mid += 1