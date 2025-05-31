# Time Complexity : O(n), where n is the length of nums
# Space Complexity : O(1), in-place sorting
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> None:

        # Dutch National Flag Algorithm (Swaps elements in-place)
        low = mid = 0
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1

# -----------------------------------------------------------------------------------------

        # Counting Sort Approach
        # count0 = count1 = count2 = 0
        
        # for num in nums:
        #     if num == 0:
        #         count0 += 1
        #     elif num == 1:
        #         count1 += 1
        #     else:
        #         count2 += 1

        # index = 0
        # for _ in range(count0):
        #     nums[index] = 0
        #     index += 1
        # for _ in range(count1):
        #     nums[index] = 1
        #     index += 1
        # for _ in range(count2):
        #     nums[index] = 2
        #     index += 1


# Test cases
if __name__ == "__main__":
    sol = Solution()
    nums1 = [2, 0, 2, 1, 1, 0]
    sol.sortColors(nums1)
    print(nums1)  # Output: [0, 0, 1, 1, 2, 2]

    nums2 = [2, 0, 1]
    sol.sortColors(nums2)
    print(nums2)  # Output: [0, 1, 2]
