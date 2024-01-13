class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if nums == 0 or len(nums) == 0:
            return []
        n = len(nums)
        low = 0
        mid = 0
        high = n - 1
        while mid <= high:
            if nums[mid] == 2:
                nums[mid],nums[high] = nums[high],nums[mid]
                high = high - 1
            elif nums[mid] == 0:
                nums[mid],nums[low] = nums[low],nums[mid]
                low = low + 1
                mid = mid + 1
            else:
                mid = mid + 1


