# https://leetcode.com/problems/sort-colors/

# This algorithm sorts an array of 0s, 1s, and 2s using three pointers. It moves 0s to the left and 2s to the right by swapping, and 1 stay in the middle. When a 2 is swapped in, the index needs to recheck to ensure the new value is processed.
# Time Complexity- O(n) Space Complexity- O(1)
class Solution:
    def sortColors(self, nums: list[int]) -> None:
        l, r = 0, len(nums) - 1
        # curent index
        i = 0
        # swapping the elements
        def swap(i, j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp

        while i <= r:
            # when the current element is 0, it should be on left side
            if nums[i] == 0:
                # swap it by calling the function
                swap(l, i)
                # increase the left pointer
                l += 1
            # when the current element is 2, it should be on right side
            elif nums[i] == 2:
                # swap it by calling the function
                swap(i, r)
                # decrease the right pointer
                r -= 1
                # after swapping, the right element comes to the begining so rechek that element
                i -= 1
            # increase the current index
            i += 1

solution = Solution()
print(solution.sortColors([2,0,2,1,1,0]))