# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach: We create a 2 pointer approach, a high and a low pointer.
# Additionally, we add a mid pointer. The objective here is to move all 0's to the left of low pointer, and all 2's to the
# right of high pointers, and keep all 1's at the mid pointer.


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
    low = 0
    mid = 0  # because we also need to check the mid with low, if low is 2 then we need to replace it with mid
    high = len(nums) - 1

    # target is to keep all 0's to left of mid, and all 2's to right of mid, and keep mid as 1
    while (mid <= high):
        if (nums[mid] == 1):
            mid = mid + 1  # this is what we want, so move to next element
        elif (nums[mid] == 0):
            swap(nums, low, mid)
            low += 1
            mid += 1
        else:  # for 2
            swap(nums, mid, high)
            high -= 1

    return nums


print(sortColors([2,0,2,1,1,0]))

print(list_sol([2,0,2,1,1,0]))