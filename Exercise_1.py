# ## Problem1 (https://leetcode.com/problems/sort-colors/)
# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
def swap(nums, p1, p2):
    if p1 == p2:
        return
    temp = nums[p1]
    nums[p1] = nums[p2]
    nums[p2] = temp


def sortColors(nums):
    # creating 3 ptrs
    l = 0  # for 0's
    m = 0  # for 1's
    h = len(nums) - 1  # for 2's
    while (m <= h):
        # if mid has 2
        if nums[m] == 2:
            # swap mid and high
            swap(nums, m, h)
            h -= 1
        # if mid has 0
        elif nums[m] == 0:
            # swap low and mid
            swap(nums, l, m)
            l += 1
            m += 1
        else:
            # update mid
            m += 1
    return nums


nums = [2, 0, 2, 1, 1, 0]
print(sortColors(nums))
