"""
Time Complexity: O(n2)
Space Complexity: O(1)
"""


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 0:
            return []

        solution = []
        nums.sort()
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            low = i + 1
            high = len(nums) - 1

            while (low < high):
                sumVal = nums[i] + nums[low] + nums[high]
                if sumVal == 0:
                    solution.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1

                    while (low < high and nums[low] == nums[low - 1]):
                        low += 1
                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1
                elif sumVal > 0:
                    high -= 1
                elif sumVal < 0:
                    low += 1

        return solution

