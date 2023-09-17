# accepted in leetcode
# time - O(N), space -O(1)
# take 3 pointers low , mid and high. Iterate for all elements based on the condition mid <= high.
# if we encounter mid == 0 or mid == 2 swap it.
class Solution:
    def sortColors(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        low = 0
        mid = 0
        high = n - 1
        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums, low, mid)
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                self.swap(nums, mid, high)
                high -= 1
        return nums

    def swap(self, nums, p1, p2):
        temp = nums[p1]
        nums[p1] = nums[p2]
        nums[p2] = temp

sol = Solution()
print(sol.sortColors([2,0,2,1,1,0]))