# TIME COMPLEXITY: O(N^2) where N is the number of elements in the array, due to sorting O(N log N) and nested two-pointer traversal for each element O(N^2).
# SPACE COMPLEXITY: O(1) or O(N) depending on the language's built-in sort implementation, excluding the space required to output the result list.

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        n = len(nums)
        result = []

        for i in range(n):
            if i != 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            low, high = i+1, n-1

            while low < high:
                total = nums[i] + nums[low] + nums[high]
                if total == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif total > 0:
                    high -= 1
                else:
                    low += 1
        return result