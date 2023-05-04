"""
s30 - TC = O(N^2) where N = len(nums), 
SC = O(1) because the only space used is to to store the result.
We don't count it in the space complexity. 
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = set()
        for i in range(len(nums)):
            newTarget = 0 - nums[i]
            low = i + 1
            high = len(nums)-1
            while low < high:
                if nums[low] + nums[high] < newTarget:
                    low += 1
                elif nums[low] + nums[high] > newTarget:
                    high -= 1
                else:
                    triplet = (nums[i], nums[low], nums[high])
                    result.add(triplet)
                    low += 1
                    high -= 1
        return list(result)
        