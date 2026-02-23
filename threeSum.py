# Time Complexity : O(n²)
# Space Complexity : O(1) (excluding output)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Sort the array, fix one element, and use two pointers to find pairs whose sum with the fixed element equals zero.
# Move pointers based on the sum and skip duplicates to ensure only unique triplets are added.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            j = i + 1
            k = len(nums) - 1
            while j < k:
                if nums[i] + nums[j] + nums[k] == 0:
                    res.append([nums[i],nums[j],nums[k]])
                    j += 1
                    k -= 1
                    while j < len(nums) - 1 and nums[j] == nums[j - 1]:
                        j += 1

                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1
                elif nums[i] + nums[j] + nums[k] > 0:
                    k -= 1
                else:
                    j += 1
        return res

        