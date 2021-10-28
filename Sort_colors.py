class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i,num in enumerate(nums):
            temp = i
            while temp >= 1 and num < nums[temp-1]:
                # print(temp)
                val = nums[temp]
                nums[temp] = nums[temp - 1]
                nums[temp - 1] = val
                temp = temp - 1