# Intuition: sort function (Not allowed)
# Intuition 2: Count sort. Take 3 vars, and count occurrence of each number. Once you have it, use the count vars to again loop in and fill the array - TC: 2O(n), SC: O(1)

# Intuition 3: Use three pointers to sort 3 nos.
# 0 to Low-1 : always sorted with 0
# Low to mid-1 : always sorted with 1s
# mid to high: unsorted part which needs sorted
# high+1 to n-1  : always sorted with 2s

# We always have to ensure that elements from the unsorted part go to the respective sorted side i.e. 0 goes to low -1 (i.e. swap # at mid with low and increment low, so 0s point only until low-1), 2 goes to high + 1 side (i.e. decrement high after swapping). When you see 1, just increment mid as mid-1 is anyway sorted with 1s.

# TC: O(n)
# SC: O(1)

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        low = mid = 0
        high = len(nums)-1
        print(nums)

        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums, mid, low)
                low += 1
                mid += 1

                print("0 found: ", nums)
            elif nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
                print("2 found: ", nums)
            else:
                mid += 1

        return nums

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


obj = Solution()
res = obj.sortColors([2, 0, 2, 1, 1, 0])
print(res)
