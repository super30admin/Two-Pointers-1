#Time Complexity: O(n), where n is the length of the input list nums
#Space Complexity:O(1)
#Submit on leetcode: Yes

class Solution:
    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = mid = 0
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                mid += 1
                low += 1
            elif nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            else:
                mid += 1
        
sol = Solution()
nums = [2,0,2,1,1,0]
print("Original List:", nums)
sol.sortColors(nums)
print("Sorted List:", nums)




