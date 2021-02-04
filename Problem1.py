# Time Complexity :O(n^2)
# Space Complexity :O(1)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 15

# Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
# Find all unique triplets in the array which gives the sum of zero.
#
# Notice that the solution set must not contain duplicate triplets.

# Example 1:
#
# Input: nums = [-1,0,1,2,-1,-4]
# Output: [[-1,-1,2],[-1,0,1]]
# Example 2:
#
# Input: nums = []
# Output: []
# Example 3:
#
# Input: nums = [0]
# Output: []


def main():
    nums = [-1,0,1,2,-1,-4]
    ans  = threeSum(nums)
    print(ans)

def threeSum(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """

    # Creating the result array.
    res = []

    # Sorting the nums array
    nums.sort()

    # Here we will have n^2 solution. Because we will first find an optimal
    # First number and then we optimized our code to find 2nd and third in O(n)
    # For each first element
    for i in range(len(nums)):

        # If the number is already positive we cannot find a sum of two numbers ahead of it which gives us the complement because they will also be positive.
        # so if number is greater than 0 then break and dont continue.
        if nums[i] > 0:
            break

        # If it's the first element or there are duplicates then skip them over other wise send it to the two sum function.
        if i == 0 or nums[i - 1] != nums[i]:
            res = helperTwoSum(nums, i, res)
    return res


def helperTwoSum(nums, i, res):
    # Here we have to find the complement of the value at nums[i] such that nums[i] + (b+c) = 0

    # Left is just after ith index
    left = i + 1
    # Right is last element.
    right = len(nums) - 1

    # Binary search
    while (left < right):
        # Checking if the sum of all three is 0 or no.
        sum = nums[i] + nums[left] + nums[right]

        # If the sum is less than 0 that means we need a greater number hence we will move our left forward.
        if sum < 0:
            left += 1
        # If the sum is greater than 0 that means we have to lower the expectations and get a less number hence we call right backwards.
        elif sum > 0:
            right -= 1

        # Else finally we got a triplet and we update the ans matrix.
        # And update the left and right both for a new pair.
        else:
            res.append([nums[i], nums[left], nums[right]])
            left += 1
            right -= 1

            # We also just iterate over all the duplicates of left and right.
            while (left < right) and nums[left - 1] == nums[left]:
                left += 1
            while (left < right) and nums[right + 1] == nums[right]:
                right -= 1
    return res

if __name__ == '__main__':
    main()