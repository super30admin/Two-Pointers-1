# The code defines a threeSum method to find all unique triplets in the list that sum up to zero.
# The approach uses sorting and a two-pointer technique to efficiently find combinations that meet the criteria.

# Initial Setup:
#   - 'res' is an empty list to store the resulting triplets.
#   - 'nums' is sorted to enable efficient duplicate handling and two-pointer traversal.

# Main Loop:
#   - Iterate through each element 'a' in nums, where 'i' is the index:
#       - If 'a' is greater than 0, break the loop since further elements are positive, making it impossible to sum to zero.
#       - If 'a' is the same as the previous element, skip this iteration to avoid duplicate triplets.
#       
# Two-Pointer Search:
#   - For each element 'a', set up two pointers, 'l' (left) at i+1 and 'r' (right) at the end of the list.
#   - While l < r:
#       - Calculate threeSum as the sum of a, nums[l], and nums[r].
#       - If threeSum > 0, move the right pointer leftward (r -= 1) to reduce the sum.
#       - If threeSum < 0, move the left pointer rightward (l += 1) to increase the sum.
#       - If threeSum == 0, a valid triplet is found:
#           - Append [a, nums[l], nums[r]] to 'res'.
#           - Move both pointers to find new pairs:
#               - Increment l and decrement r.
#               - Skip duplicate values by advancing l while nums[l] == nums[l - 1] and l < r.
#   
# Final Result:
#   - After processing all elements, 'res' contains all unique triplets that sum to zero, which is returned.

# TC: O(n^2) - Sorting takes O(n log n), and for each element, the two-pointer search takes O(n).
# SC: O(1) - The space complexity is constant if we ignore the output list 'res'.


from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        for i, a in enumerate(nums):
            if a > 0:
                break

            if i > 0 and a == nums[i - 1]:
                continue

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
                    r -= 1
                    while nums[l] == nums[l - 1] and l < r:
                        l += 1
                        
        return res