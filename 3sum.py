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
        # edge
        for i in range(len(nums)):
            # no outside duplicacy
            if i > 0 and nums[i] == nums[i - 1]: # ensure i != 0
                continue

            # two pointer solution
            low = i + 1
            high = len(nums) - 1

            while (low < high):
                sumVal = nums[i] + nums[low] + nums[high]
                if sumVal == 0:
                    solution.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1

                    # no inside duplicacy
                    while (low < high and nums[low] == nums[low - 1]):  # ensure low is always less than high
                        low += 1
                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1
                elif sumVal > 0:
                    high -= 1
                elif sumVal < 0:
                    low += 1

        return solution

