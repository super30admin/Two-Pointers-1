# Time Complexity : O(n) n is number of elements in the list
# Space Complexity : O(1) we are not creating any space
# Did this code successfully run on LeetCode : yes
# Any problem you faced while coding this : No


#we will use three pointers, the low one indicates that element before that pointer will be 0,
#the high one indicates that element after that pointer will be 2.
# the mid pointer helps to swap elements to low and high, when it meets the element that shouldnt be present there

class Solution:
    def __init__(self, nums):
        self.nums = nums

    def sortColors(self):
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        high = len(self.nums) - 1
        mid = 0

        while mid <= high:
            print(mid)
            if self.nums[mid] == 1:
                mid += 1
            elif self.nums[mid] == 0:
                self.swap(mid + 1, low + 1)
            else:
                self.swap(mid, high + 1)

        return self.nums

    def swap(self, i, j):
        temp = self.nums[i]
        self.nums[i] = self.nums[j]
        self.nums[j] = temp


sol = Solution([0, 2, 1, 1, 2, 0])
print(sol.sortColors())
