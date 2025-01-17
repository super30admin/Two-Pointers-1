# Time Complexity : O(n), no of elements in the given array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# using three pointers to keep a track of 0s, 1s and 2s
# storing 0s at left, 1st at mid and 2s at right
# iterating the list and swapping the elements as we go forward

class Solution(object):
    def swap(self, nums, i , j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # using three pointers to sort the list with repiting nos - 0, 1 and 2
       
        left = 0
        mid = 0
        n = len(nums)
        right = n - 1

        # mid should not cross right
        while (mid <= right):
            # if there is a 2 at mid, it should go to right
            if nums[mid] == 2:
                # swap with right
                self.swap(nums, mid, right)
                # since right contains a 2 now, we can move right
                right -= 1
                # we do not move mid because we need to make sure that the new value of mid is correctly positioned
            
             # if there is a 0 at mid, it should go to left
            elif nums[mid] == 0:
                # swap with left
                self.swap(nums, mid, left)
                mid += 1
                # since left contains a 0 now, we can move left
                left += 1
            else:
                # value at mid is 1, which is fine so we move to the next index
                mid += 1
        # returning the same array/list, not using any new space
        return nums
