# 2 pointers
# Sort the array so to use two pointers efficiently.
# For each number, fix it and look for two other numbers using low and high pointers.
# Skip duplicates to avoid repeating the same triplet in the result.
#Time Complexity:O(n^2)
#Space Complexity:O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
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