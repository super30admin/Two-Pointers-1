#
# Time Complexity = O(n)
# Space Complexity = O(1)
#
def sortColors(nums):
    p1 = -1
    p2 = len(nums)
    i = 0
    while i < p2:
        if nums[i] == 0:
            p1 += 1
            nums[p1], nums[i] = nums[i], nums[p1]
        if nums[i] == 2:
            p2 -= 1
            nums[p2], nums[i] = nums[i], nums[p2]
            i -= 1
        i += 1
