"""
## Problem2 (https://leetcode.com/problems/3sum/)
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],




A solution set is:


[


  [-1, 0, 1],


  [-1, -1, 2]


]

// Time Complexity : O(n^2 + nlogn) = n^2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No

"""
def Threesum(nums):
    if nums==None or len(nums) < 2:
        return []
    nums.sort()   # sort to easy handling of duplicates
    output = []   # output list
    for i in range(len(nums)):
        if i > 0 and nums[i] == nums[i-1]: # current  number is same as previous number then skip the entire for loop
            continue
        l = i+1       # left pointer wil be i +1 always
        r = len(nums)-1  # right at last
        while l < r:
            sum_ = nums[i] + nums[l] + nums[r]   #calculate sum
            if sum_ == 0:     # if 0 append and move both pointers
                output.append([nums[i], nums[l], nums[r]])
                r -= 1
                l += 1
                while l < r and nums[l]==nums[l-1]:  # to check duplicates while moving left pointer
                    l += 1
                while l < r and nums[r]==nums[r+1]:  # to check duplicates while moving right pointer
                    r -= 1
            elif sum_ > 0:  # if sum is greater than target which is 0 here then decrease right pointer
                r -= 1
                while l < r and nums[r]==nums[r+1]:
                    r -= 1
            else:           # if sum is less than target which is 0 here then increase right pointer
                l += 1
                while l < r and nums[l]==nums[l-1]:
                    l += 1
    return output


print(Threesum([-1, 0, 1, 2, -1, -4]))