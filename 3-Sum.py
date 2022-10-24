# Time Complexity - O(n^2)
# Memory Complexity - O(1) or O(n) depending on the sorting algorithm.
# Does this code run on Leetcode: Yes
# Did you face any issues while coding the solution: No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        # To make sure that the same number is not placed in the triplet again. 
        for i, a in enumerate(nums):
            if i > 0 and a == nums[i - 1]:
                continue
            # Perform TwoSumII solution but update the pointers as the solution is not just a 
            # Single array unlike the TwoSumII solution.
            l, r = i + 1, len(nums) - 1
            while l < r:
                threeSum = a + nums[l] + nums[r]
                if threeSum > 0:
                    r -= 1
                elif threeSum < 0:
                    l += 1
                else:
                    res.append([a, nums[l], nums[r]])
                    l += 1
                    while nums[l] == nums[l - 1] and l < r:
                        l += 1
        return res
    
    