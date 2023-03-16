# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, nums: List[int]) -> int:
        low = 0
        high = len(nums) - 1
        width = high - low
        maxx = 0
        while low < high:
            area = min(nums[low], nums[high]) * width
            maxx = max(area, maxx)
            if nums[low] <= nums[high]:
                low += 1
            elif nums[high] < nums[low]:
                high -= 1
            width -= 1
        return maxx
