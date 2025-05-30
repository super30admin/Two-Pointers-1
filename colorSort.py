#Time complexity - o(1)
#Space complexity - o(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        left = 0
        right = len(nums)-1
        mid = 0

        while mid<=right:

            if nums[mid] == 1:
                mid+=1
            elif nums[mid] == 2:
                nums[right],nums[mid] = nums[mid],nums[right]
                right-=1
            else:
                nums[left],nums[mid] = nums[mid],nums[left]
                left+=1
                mid+=1
                

            
        