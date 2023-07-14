class Solution:
    # Time Complexity:O(n)
    # Space Complexity:O(1)
    def sortColors(self, nums: List[int]) -> None:
        low = 0
        mid = 0
        high = len(nums) - 1

        def swap(nums, mid, curr) -> None:
            temp = nums[mid]
            nums[mid] = nums[curr]
            nums[curr] = temp

        while mid <= high:
            if nums[mid] == 2:
                swap(nums, mid, high)
                high -= 1
            elif nums[mid] == 0:
                swap(nums, mid, low)
                mid += 1
                low += 1
            else:
                mid += 1
