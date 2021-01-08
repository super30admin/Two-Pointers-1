# Approach: Brute Force -- Take the frequency count of all numbers in hashmap and fill the array with 0's,1's,2's
# Space Complexity: An additonal space of O(N)

# Optimized solution: Use 3 pointers which each will denote the position of 0,1,2 and swap numbers accordingly

# Time Complexity: O(N)
# Space Complexity: O(1)
def sortColors(nums):

    if not nums:
        return

    left = 0
    middle = 0
    right = len(nums) - 1

    while middle <= right:

        if nums[middle] == 1:
            middle += 1

        elif nums[middle] == 0:
            nums[middle], nums[left] = nums[left], nums[middle]
            left += 1
            middle += 1

        else:
            nums[middle], nums[right] = nums[right], nums[middle]
            right -= 1

    return nums