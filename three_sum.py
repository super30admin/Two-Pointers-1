# Approach (Sorting + HashSet):
# 1. Sort the array to easily handle duplicates and to maintain order.
# 2. Fix one number (nums[i]) and use a hash set to find two other numbers 
#    (nums[j], nums[k]) that sum up to -nums[i].
# 3. Skip duplicate elements for both i and j to avoid duplicate triplets.
#
# Time Complexity: O(n^2) — Outer loop runs O(n) times, inner loop with hash set runs O(n).
# Space Complexity: O(n) — For storing elements in the hash set.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # Sort the array to simplify duplicate handling and searching
        nums.sort()
        res = []
        n = len(nums)
        i = 0

        # Iterate through each number, fixing it as the first element of the triplet
        while i < n - 2:
            numsSet = set()  # Hash set to store seen elements for the current i
            target = -1 * nums[i]  # We need two numbers that sum to this target
            j = i + 1

            # Iterate over the rest of the numbers to find the remaining two
            while j < n:
                # If complement exists in the set, we found a valid triplet
                if (target - nums[j]) in numsSet:
                    res.append([nums[i], target - nums[j], nums[j]])

                    # Skip duplicates for nums[j] to avoid repeating the same triplet
                    while j + 1 < n and nums[j] == nums[j + 1]:
                        j += 1

                # Add current element to the set for future lookups
                numsSet.add(nums[j])
                j += 1

            # Move to the next unique element for nums[i]
            i += 1
            while i < n - 2 and nums[i - 1] == nums[i]:
                i += 1

        # Return all unique triplets that sum to zero
        return res
