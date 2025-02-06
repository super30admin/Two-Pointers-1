class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        l = 0
        mid = 0
        r = n-1

        while mid <= r:
            if nums[mid] == 2 :
                # swap with mid with right
                nums[mid], nums[r] = nums[r], nums[mid]
                r -= 1
            elif nums[mid] == 0:
                # swap with left
                nums[l], nums[mid] = nums[mid], nums[l]
                l += 1
                mid += 1
            else:
                mid += 1
            
# TC: O(n)
# SC : O(1)

