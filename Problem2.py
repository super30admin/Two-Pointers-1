# Problem2 (https://leetcode.com/problems/3sum/)
# Time Complexity: O(n^2), outer loop runs n times, inner two-pointer loop runs up to n times for each
#ignore sorting in TC since it's O(n log n) and dominated by O(n^2) of the two-pointer search
# Space Complexity: O(1),no extra space used apart from output list, sort is in-place

# We sort the array first so duplicates sit next to each other and two pointers can be used.
# We fix one number at a time with the outer loop, then use two pointers to find the other two.
# We skip duplicate values at every level (outer loop and inner pointers) to avoid duplicate triplets.

class Solution:
    def threeSum(self, nums):
        nums.sort()                          # sort so we can use two pointers and detect duplicates easily
        n = len(nums)
        result = []                          # stores all valid triplets

        for i in range(n):                   # fix nums[i] as the first/smallest number of the triplet
            if i != 0 and nums[i] == nums[i-1]:   # skip if same value as previous i (avoids duplicate triplets)
                continue
            if nums[i] > 0:                  # if smallest number is already positive, sum can never be 0
                break

            low, high = i+1, n-1             # low starts right after i, high starts at the end
            while low < high:                # search for the other two numbers using two pointers
                total = nums[i] + nums[low] + nums[high]

                if total == 0:               # found a valid triplet
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1                 # move both pointers inward to look for more triplets
                    high -= 1

                    while low < high and nums[low] == nums[low - 1]:  # skip duplicate low values
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:  # skip duplicate high values
                        high -= 1

                elif total > 0:               # sum too big → decrease it by moving high down
                    high -= 1
                else:                         # sum too small → increase it by moving low up
                    low += 1

        return result