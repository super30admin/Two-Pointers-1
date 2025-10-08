# Time Complexity  : O(n^2)      # Sorting takes O(n log n), two-pointer search for each element takes O(n)
# Space Complexity : O(1)        # Ignoring the result list; sorting and two-pointer use constant space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Initially handling duplicates and pointer movement correctly can be tricky.

# ------------------------------
# Approach:
# ------------------------------
# Goal: Find all unique triplets [a, b, c] such that a + b + c = 0.
#
# 1. Sort the array to make two-pointer traversal possible.
# 2. Loop over each element 'nums[i]' as the first number of a triplet.
# 3. For each i:
#    - Skip duplicates (so we don’t repeat the same triplet).
#    - Since array is sorted, if nums[i] > 0, break (because all further numbers will be positive).
#    - Use two pointers:
#        l = i + 1  (left)
#        r = n - 1  (right)
#      Move pointers based on total = nums[i] + nums[l] + nums[r]:
#        - If total == 0 → store triplet, move both l and r skipping duplicates.
#        - If total < 0 → need a bigger sum → move l right.
#        - If total > 0 → need a smaller sum → move r left.
#
# 4. Return all unique triplets in the result list.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # Step 1: Sort the array to allow two-pointer traversal
        nums.sort()
        result = []
        n = len(nums)
        
        # Step 2: Fix one number and find other two using two-pointer
        for i in range(n):
            # Skip duplicate 'i' values to avoid repeating the same triplet
            if i != 0 and nums[i] == nums[i - 1]:
                continue

            # Since nums is sorted, if current number > 0, 
            # further triplets will all be positive → break early
            if nums[i] > 0:
                break

            # Initialize two pointers
            l, r = i + 1, n - 1

            # Step 3: Two-pointer search for pairs that sum to -nums[i]
            while l < r:
                total = nums[i] + nums[l] + nums[r]

                # Case 1: Found a valid triplet
                if total == 0:
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1

                    # Skip duplicate elements at 'l' to avoid repeating triplets
                    while l < r and nums[l] == nums[l - 1]:
                        l += 1
                    # Skip duplicate elements at 'r' as well
                    while l < r and nums[r] == nums[r + 1]:
                        r -= 1

                # Case 2: Sum too large → decrease right pointer to reduce total
                elif total > 0:
                    r -= 1

                # Case 3: Sum too small → increase left pointer to increase total
                else:
                    l += 1

        # Step 4: Return all unique triplets
        return result
