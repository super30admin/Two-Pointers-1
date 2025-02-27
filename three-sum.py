# The code fixes one number (nums[i]) and uses a hashmap to find two numbers that sum to -nums[i], 
# ensuring unique triplets by storing results in a set. Sorting the array helps handle duplicates efficiently.
# Time Complexity: O(N²) (We iterate N times and do an O(N) lookup per loop).
# Space Complexity: O(N) (For storing values in hashMap and results in set()).

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = set()
        for i in range(len(nums)):
            hashMap = {}
            target = -nums[i]
            for j in range(i + 1, len(nums)):
                diff = target - nums[j]
                if diff in hashMap:
                    result.add((nums[i], diff, nums[j]))
                hashMap[nums[j]] = j
        return list(result)