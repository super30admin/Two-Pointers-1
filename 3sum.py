# Approach: Sort + Two Pointers
# Time Complexity: O(n2) 
# Space Complexity: O(1)
# The array is first sorted to simplify duplicate handling and enable the two-pointer technique.
# For each element, we fix it and use two pointers (l and h) to find a triplet that sums to zero.
# If the fixed element is greater than zero, we can break early since all following elements are also positive.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []

        for i in range(len(nums)):
            # Skip duplicate fixed elements
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            # If the current number is greater than 0, no triplet can sum to 0
            if nums[i] > 0:
                break

            l, h = i + 1, len(nums) - 1
            while l < h:
                total = nums[i] + nums[l] + nums[h]

                if total == 0:
                    res.append([nums[i], nums[l], nums[h]])
                    l += 1
                    h -= 1

                    # Skip duplicate values at left and right
                    while l < h and nums[l] == nums[l - 1]:
                        l += 1
                    while l < h and nums[h] == nums[h + 1]:
                        h -= 1

                elif total < 0:
                    l += 1
                else:
                    h -= 1
        return res
