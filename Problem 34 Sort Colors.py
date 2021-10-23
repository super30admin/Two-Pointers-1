# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(1)
# Logic: use 2 pointers, one from start & one from end. use I to traverse through the array. if a[i] == 0, swap with
# start pointer, if a[i] == 2 then swap with end pointer else just increment i.

class Solution:
    def sortColors(self, nums):
        p1 = 0
        p2 = len(nums) - 1
        i = 0
        while i <= p2:
            if nums[i] == 0:
                nums[i], nums[p1] = nums[p1], nums[i]
                p1 += 1
                i += 1
            elif nums[i] == 2:
                nums[i], nums[p2] = nums[p2], nums[i]
                p2 -= 1
            else:
                i += 1
