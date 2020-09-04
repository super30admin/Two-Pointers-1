"""
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

"""
nums = [-1, 0, 1, 2, -1, -4]
# def 3Sum(array):
nums = sorted(nums)
res = []
for i in range(0, len(nums)-2):

    left = i + 1
    right = len(nums) -1

    if i > 0 and nums[i] == nums[i-1]:
        continue

    while (left < right):
        sum = nums[i] + nums[left] + nums[right]

        if sum < 0:
            left = left + 1

        elif sum > 0:

            right = right -1

        else:

            res.append([nums[i], nums[left], nums[right]])

            while left < right and nums[left] == nums[left + 1]:
                left = left+1

            while left < right and nums[right] == nums[right -1]:
                right = right-1
        left = left+1
        right = right-1
print(res)


"""
1)Sort the array
2)Take three pointers, i which points to the curr element, left and right
3)left = i+1 and right starts from the end of the List
4)sum = i + left + right.
5)if sum > 0: decrement right, <0 increment left else append the values to res.
6)print result

Time Complexity = O(n^3)
Space Complexity = O(n)

"""
