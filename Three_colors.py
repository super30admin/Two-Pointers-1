# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach: We create a 3 pointer approach, left, right and current pointer.
# The objective here is to move all 0's to the left of left pointer, and all 2's to the
# right of right pointers, and keep all 1's at the current pointer.


def swap(nums, index_1, index_2):
    temp = nums[index_1]
    nums[index_1] = nums[index_2]
    nums[index_2] = temp


def list_sol(nums):
    l = [0 for _ in range(3)]

    for num in nums:
        if num == 0:
            l[0]+=1
        elif num == 1:
            l[1] +=1

        else: l[2] +=1

    return [0]*l[0] + [1]*l[1] + [2]*l[2]

def sortColors(nums) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """

    if len(nums) == 0:
        return []

    left = 0
    right = len(nums) - 1
    current = 0

    while (current <= right):
        if nums[current] == 0:
            swap(nums, current, left)
            current += 1  # since current value got swapped, increment it
            left += 1  # since now left position got 0, increment it

        elif nums[current] == 1:
            # no need to swap, as we want current to be 1, so just increment it
            current += 1

        else:  # for 2
            swap(nums, current, right)
            right -= 1  # since right got 2, decrement it
            # current +=1 #  This is critical, no need of this-> because current may either get 0, 1, 2 after swapping, so if we increment 2, 0, and 1 will be at same position

    return nums

print(list_sol([2,0,2,1,1,0]))

print(sortColors([2,0,2,1,1,0]))
