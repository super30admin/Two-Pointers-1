# Time Complexity : O(n), where n is the length of nums.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution(object):
    # Starting with three pointers, left; mid; right, the goal is to collect all 0's at low,
    # 1's at mid and 2's at right. If a 0 is encountered at mid swap(mid,left) and move both
    # pointers, if a 2 then swap(mid,right) and move right pointer and in case of 1 move mid pointer.
    def sortColors(self, nums):
        left, mid, right = 0, 0, len(nums)-1

        while mid <= right:
            if nums[mid] == 0:
                nums[mid], nums[left] = nums[left], nums[mid]
                left += 1
                mid += 1
            elif nums[mid] == 2:
                nums[mid], nums[right] = nums[right], nums[mid]
                right -= 1
            else:
                mid += 1
        # print nums


Solution().sortColors([2, 0, 2, 1, 1, 0, 2, 2, 1, 1, 0])
