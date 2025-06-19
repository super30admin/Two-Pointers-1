"""
Time complexity -> O(n^2)
Space Complexity = O(n) for sorting
Logic
1. sort numbers
2. generate triplets by iterating through the array (i from 0 to len(array), j = i+1, k = len(array)-1
3. Check if triplet sum = 0. If 0, add to result and move j and k pointers as we need to find other triplets with i as one of them.
If the j and j+1 value are same, increment j till its not. Similary do for k as well. This is to avoid duplicates
if triplet sum >0, we need to reduce it and thats done by moving k. If triplet sum<0, we need to increase it by moving j.
Do the same with i as well at the beginning.
The moving of i,j,k when the previously processed value is the same is used inorder to remove set implementation for the result.
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        res = []
        for i in range(len(nums)):
            if (i > 0 and nums[i] == nums[i - 1]):
                continue
            j = i + 1
            k = len(nums) - 1
            while (j < k):
                total = nums[i] + nums[j] + nums[k]
                if total < 0:
                    j += 1
                elif total > 0:
                    k -= 1
                elif total == 0:
                    res.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1
                    while (j < k and nums[j] == nums[j - 1]):
                        j += 1
                    while (j < k and nums[k] == nums[k + 1]):
                        k -= 1
        return res
