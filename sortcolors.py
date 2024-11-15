"Time Complexity is O(N)"
"Space Complexity is O(1)"

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        low, high = 0, len(nums) - 1
        i = 0
        
        while i <= high:
            if nums[i] == 0:
                nums[i], nums[low] = nums[low], nums[i]
                low += 1
                i += 1
            elif nums[i] == 2:
                nums[i], nums[high] = nums[high], nums[i]
                high -= 1
            else:  # nums[i] == 1
                i += 1
        