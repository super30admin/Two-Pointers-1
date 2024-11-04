'''
    Time Complexity: O(n^2)
    Space Complexity: O(1)
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        n = len(nums)
        nums.sort()

        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            j = i + 1
            k = n - 1
            target = 0 - nums[i]

            while j < k:
                if nums[j] + nums[k] == target:
                    result.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1

                    while j < k and nums[j] == nums[j - 1]:
                        j += 1

                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1
                elif nums[j] + nums[k] < target:
                    j += 1
                else:
                    k -= 1

        return result