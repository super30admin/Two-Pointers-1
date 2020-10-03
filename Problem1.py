# Time Complexity: O(N)
# Space Complexity: O(1)
# Leetcode all test cases passed: Yes
# Any difficulties: No
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left, mid, right = 0, 0, len(nums)-1
        while mid <= right:
            if nums[mid] == 0:
                nums[left], nums[mid] = nums[mid], nums[left]
                left+=1
                mid+=1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid], nums[right] = nums[right], nums[mid]
                right-=1
        
