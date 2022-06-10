"""
Leetcode - https://leetcode.com/problems/3sum/ (submitted)
TC- O(NlognN + N^2) = O(N^2), SC - O(1)
Lecture - https://youtu.be/Zk6c23jE6Dg
Challenge - It was tricky to understand what each pointer mean to do and when to move the pointer.
FAQ-
Hashmap O(N) SC, O(N) TC, is the most optimized approach for 2 sum problem. Why is it not for 3 sum?
Using two pointer approach in 2sum required NlogN sorting which was increasing our TC from O(N) hashmap solution to
O(NlogN + N) = O(NlogN). In 3sum problem, since we have a for loop, our hashmap approach will take O(N^2) TC and O(N)
space. While, if we do two pointer approach our TC will be O(NlogN + N*N) = O(N^2) but our space is O(1).
So, in 3sum problem, two pointer solution beats hashmap solution with time complexity.

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []

Example 3:
Input: nums = [0]
Output: []

Constraints:
0 <= nums.length <= 3000
-105 <= nums[i] <= 105
"""

'''
Ideation-
Using two pointer approach as discussed in FAQ.
If first element of the pair is greater than zero, no new triplets are possible since all the elements on the right has
to be greater than 0 given the nature of sorted array
To ensure no duplication, since our array is sorted, we can ignore duplicate elements.
'''


class Solution:
    def threeSum(self, nums):
        n = len(nums)
        result = []
        nums.sort()
        for i in range(n):
            # skipping any triplets if first element of the pair is a duplicate
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            # skipping any triplets if first element of the pair is greater than 0
            if nums[i] > 0:
                break

            low = i + 1
            high = n - 1
            while low < high:
                sum_ = nums[i] + nums[low] + nums[high]
                if sum_ == 0:
                    desiredTriplet = [nums[i], nums[low], nums[high]]
                    result.append(desiredTriplet)
                    # move pointers to look for next triplets
                    low += 1
                    high -= 1

                    # skipping inside duplicates
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1

                elif sum_ < 0:
                    low += 1
                else:
                    high -= 1

        return result

nums = [-1,0,1,2,-1,-4]
tripletsList = Solution().threeSum(nums)
print(tripletsList)
