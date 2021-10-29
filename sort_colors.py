# The solution below is a two pass solution, Time complexity is O(n)
# However, we can also solve the same problem in single pass with O(n) Time complexity
# Space complexity is O(1)

def sort_colors(nums):
    if not nums:
        return

    zero, one, two = 0, 0, 0
    for i in range(len(nums)):
        if nums[i] == 0:
            zero += 1
        elif nums[i] == 1:
            one += 1
        else:
            two += 1

    for i in range(len(nums)):
        if i == 0 and i < zero and zero > 0:
            nums[i] = 0
        elif zero <= i < zero + one and one > 0:
            nums[i] = 1
        else:
            nums[i] = 2
    return nums




