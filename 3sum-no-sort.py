class Solution:
    # Time Complexity: O(n^2)
    # Space Complexity: O(n)
    # The solution is a no sort array 3 sum solution
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = set() # check duplicates in result
        dup = set() # check duplicates in outside
        for i in range(len(nums)):
            if nums[i] not in dup:
                self.twoSum(nums, i, res)
                dup.add(nums[i])
        return res
    
    def twoSum(self, nums: List[int], i: int, res: List[List[int]]):
        seen = set()
        j = i + 1
        while j < len(nums):
            complement = -nums[i] - nums[j]
            if complement in seen:
                # duplicates will be skipped and as tuple is sorted, we wont have duplicates at the place.
                res.add(tuple(sorted([nums[i], nums[j], complement])))
            seen.add(nums[j])
            j += 1
