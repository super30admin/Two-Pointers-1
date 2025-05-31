# Time Complexity: O(n^2)
# Space Complexity: O(1)

class Solution:
    def threeSum(self, nums):
        result = []
        nums.sort()
        n = len(nums)

        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue  # Skip duplicates for i

            low, high = i + 1, n - 1
            while low < high:
                total = nums[i] + nums[low] + nums[high]

                if total == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1

                    # Skip duplicates for low and high
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1

                elif total < 0:
                    low += 1
                else:
                    high -= 1

        return result