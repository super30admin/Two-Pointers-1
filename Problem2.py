 
    # Approach:
    # - First, sort the input list to make it easier to find triplets that sum to zero.
    # - Iterate through the sorted list using an index `i`, and for each number, use two pointers (`l` and `r`) to find pairs whose sum with the current number is zero.
    # - To avoid duplicate triplets, skip over any repeated values for `n` and ensure duplicates are not added in the result by incrementing the left pointer `l` accordingly.
    # - The loop continues until all possible triplets are found.

    # Time Complexity (TC): O(n^2)
    # - Sorting the array takes O(n log n).
    # - For each element, we perform a two-pointer traversal, which takes O(n).
    # - Therefore, the overall complexity is O(n log n + n^2), which simplifies to O(n^2).

    # Space Complexity (SC): O(1) excluding the space required for the result.
    # - Sorting is done in-place, so no extra space is required apart from the output list.
    # - The result list, which holds the triplets, will take O(k) space, where `k` is the number of valid triplets found.
    


class Solution(object):
    def threeSum(self, nums):
        res = []
        nums.sort()

        for i, n in enumerate(nums):
            if i > 0 and n == nums[i - 1]:
                continue
            l, r = i + 1, len(nums) - 1
            while l < r:
                ans = n + nums[l] + nums[r]
                if ans > 0:
                    r -= 1
                elif ans < 0:
                    l += 1
                else:
                    res.append([n, nums[l], nums[r]])
                    l += 1
                    while nums[l] == nums[l - 1] and l < r:
                        l += 1

        return res
