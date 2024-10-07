# Time Complexity (TC): O(n)
# The while loop runs through each element of the array exactly once, making the time complexity linear with respect to the input size `n`.

# Space Complexity (SC): O(1)
# The solution uses constant extra space (pointers `l`, `m`, and `r`), hence the space complexity is constant.

# Approach:
# We use three pointers:
#   - `l` (left) tracks the position for the next 0.
#   - `m` (middle) is the current element being checked.
#   - `r` (right) tracks the position for the next 2.
# As we traverse the array:
#   - If the current element is 0, we swap it with the element at the left pointer and increment both `l` and `m`.
#   - If the current element is 1, we just move the `m` pointer forward.
#   - If the current element is 2, we swap it with the element at the right pointer and decrement `r`.

class Solution(object):
    def sortColors(self, nums):
       l, m = 0, 0
       r = len(nums) - 1

       def swap(a, b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp

       while m <= r:
        if nums[m] == 0:
            swap(m, l)
            l += 1
            m += 1
        elif nums[m] == 1:
            m += 1
        else:
            swap(m, r)
            r -= 1

