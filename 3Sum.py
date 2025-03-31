# Find all unique triplets that sum to zero by fixing one element and using two pointers on the rest
# TC: O(n^2)  Two-pointer approach after sorting
# SC: O(1)  Ignoring space required for output

from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        ans = []
        nums.sort()  # Sort the array to use two-pointer technique

        for i in range(n):
            # Skip duplicates for the first element
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            # No need to continue if the first number is greater than zero
            if nums[i] > 0:
                break

            # Two-pointer initialization
            j, k = i + 1, n - 1
            while j < k:
                total_sum = nums[i] + nums[j] + nums[k]
                if total_sum > 0:
                    k -= 1  # Decrease the right pointer
                elif total_sum < 0:
                    j += 1  # Increase the left pointer
                else:
                    # Found a triplet that sums to zero
                    ans.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1
                    # Skip duplicates for the second element
                    while j < k and nums[j] == nums[j - 1]:
                        j += 1
                    # Skip duplicates for the third element
                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1

        # Print the result
        print(ans)
        return ans


# Example usage
sol = Solution()
nums = [-1, 0, 1, 2, -1, -4]
sol.threeSum(nums)
