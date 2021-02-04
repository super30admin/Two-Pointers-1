# Time Complexity :O(n)
# Space Complexity :O(1)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 75

# Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color
#  are adjacent, with the colors in the order red, white, and blue.
#
# We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

# Example 1:
#
# Input: nums = [2,0,2,1,1,0]
# Output: [0,0,1,1,2,2]
# Example 2:
#
# Input: nums = [2,0,1]
# Output: [0,1,2]
# Example 3:
#
# Input: nums = [0]
# Output: [0]
# Example 4:
#
# Input: nums = [1]
# Output: [1]

def main():
    nums = [2,0,2,1,1,0]
    ans = sortColors(nums)
    print(ans)
def sortColors(nums):
    """
    :type nums: List[int]
    :rtype: None Do not return anything, modify nums in-place instead.
    """

    # Return None if nums is empty
    if not nums:
        return None

    # We will use left and right for boundaries. And use current to manipulate
    left = 0
    current = 0
    right = len(nums) - 1

    while (current <= right):
        # If nums[current] = 2 : swap rightTh element and move pointer to the left because the position for 2 is fixed now from the end.
        if nums[current] == 2:
            nums[current], nums[right] = nums[right], nums[current]
            right -= 1
        # If nums[current] = 0 : swap currentth and leftth elements and move both pointers to the right because the position for 0 is fixed now from the start.
        elif nums[current] == 0:
            nums[current], nums[left] = nums[left], nums[current]
            left += 1
            current += 1
        # If it's just one don't do anything.
        else:
            current += 1

    return nums

if __name__ == '__main__':
    main()