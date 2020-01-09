from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        """
            https://leetcode.com/problems/sort-colors/
            // Time Complexity : O(n)
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode : Yes
            // Any problem you faced while coding this : No
            // Three line explanation of solution in plain english:
                    - Dutch National Flag Problem
                    - the low pointer should point to all (0)'s 
                    - the mid pointer should point to all (1)'s 
                    - the high pointer should point to all (2)'s
                    - swap mid with low when we encounter 0, increment low and mid
                      swap mid with high when we encounter 2, decrement high
                      just move mid when we encounter 1, increment mid
            // Other approaches - 
                    - Use Quick Sort (in place, not stable) 
                        Time- O(nlogn) Space- O(1)(without recursive stack) 
                                              O(logn) (with recursive stack)
        """
        # edge case
        if not nums:
            return
        low = mid = 0
        high = len(nums) - 1

        while mid <= high:
            # case 1 (mid is 0)
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            # case 2 (mid is 1)
            elif nums[mid] == 1:
                mid += 1
            # case 3 (mid is 2)
            else:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
        print(nums)

    def sort_colors_counting_sort(self, nums: List[int]) -> None:
        """
            // Time Complexity : O(n)
            // Space Complexity : O(1)
               But not in place
        """
        counts = [0, 0, 0]
        for num in nums:
            counts[num] += 1

        i = 0
        for idx, count in enumerate(counts):
            while count > 0:
                nums[i] = idx
                count -= 1
                i += 1
        print(nums)


if __name__ == '__main__':
    h = Solution()

    h.sortColors([2, 0, 2, 1, 1, 0])
    h.sort_colors_counting_sort([2, 0, 2, 1, 1, 0])

    # edge case for mid <= high
    h.sortColors([1, 0, 2])
    h.sort_colors_counting_sort([1, 0, 2])

    # case where we can not increase mid when we increase high
    h.sortColors([1, 2, 0])
    h.sort_colors_counting_sort([1, 2, 0])
