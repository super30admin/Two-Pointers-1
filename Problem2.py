# Time Complexity = n log n + n2 = n2  Space Complexity = O(1)

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        t = 0
        l = len(nums)
        result = []
        nums.sort()

        for i in range(l - 2):
            if i > 0 and nums[i] == nums[i - 1]: continue  # duplicates of i
            if nums[i] > 0: break  # nums[i] is greater than target
            low, high = i + 1, l - 1
            while low < high:
                add = nums[i] + nums[low] + nums[high]
                if add == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    # duplicates of low
                    # also checking base condition again as low and high are mutated
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:  # duplicates of high
                        high -= 1
                elif add > 0:  # move high
                    high -= 1
                else:  # move low
                    low += 1

        return result

