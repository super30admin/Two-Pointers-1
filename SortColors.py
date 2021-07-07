# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums or len(nums) == None:
            return 

        h = len(nums) - 1 
        l = 0 
        mid = l 

        while h >= mid:
            if nums[mid] == 0:
                nums[mid], nums[l] = nums[l], nums[mid]
                l += 1 
                mid += 1 

            elif nums[mid] == 2:
                nums[mid], nums[h] = nums[h], nums[mid]
                h -= 1

            else:
                mid += 1 

        return nums