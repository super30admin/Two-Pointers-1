'''
Time: O(N^2)
Sapce: O(N)
'''
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        """
        for a triplet to form one of the digit
        should be negative or at least a 0
        duplicate triplets should not be considered
        in the final result
        input is always at least 3 elements
        need to finall 2 sum pairs for the first digit in the triplet
        """

        def find_two_sum_pairs(nums, j, tgt):
            k = len(nums) - 1
            pairs = []
            while j < k:
                if nums[j] + nums[k] == tgt:
                    pairs.append([nums[j], nums[k]])
                    j += 1
                    while j < k and nums[j] == nums[j - 1]:
                        j += 1
                elif nums[j] + nums[k] > tgt:
                    k -= 1
                else:
                    j += 1
            return pairs

        if len(nums) < 3:
            return []
        res = []

        nums.sort()  # inward two pointer will not work without the list being sorted
        for i in range(len(nums)):
            if nums[i] > 0:
                break  # we cannot form triplets with only +ve numbers
            if i > 0 and nums[i] == nums[i - 1]:
                continue  # we don't want the first number to be considered again if it duplicates
            if i < len(nums) - 1:
                pairs = find_two_sum_pairs(nums, i + 1, -nums[i])
            for pair in pairs:
                res.append([nums[i]] + pair)
        return res
