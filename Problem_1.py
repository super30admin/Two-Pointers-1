# Sort Colours
# Time Complexity : O(N log N)
# Space Complexity : O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        r = 0
        w = 0
        b = len(nums)-1
        while w<=b:
            if nums[w] == 0:
                nums[r],nums[w] = nums[w],nums[r]
                r = r+1
                w = w+1
            elif nums[w] == 1:
                w = w+1
            else:
                nums[w],nums[b] = nums[b],nums[w]
                b-=1
        return nums

