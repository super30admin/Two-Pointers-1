# https://leetcode.com/problems/3sum/

# Time Complexity : O(N ^ 2) is number of elements in the array.
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach.
# Approach - We divide the array into 3 sets, zeros. negative and positive numbers. Then firstly we find if there is
# at least one zero and look for if there is at least one positive number for every negative number.
# Then we check if there are at least 3 zeroes
# Then for every pair of negative numbers if there is at least one positive number and
# for every pair of positive numbers if there is at least one negative number.


from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = set()
        negative_nums, positive_nums, zeros = [], [], []
        for cur in nums:
            if cur == 0:
                zeros.append(cur)
            elif cur < 0:
                negative_nums.append(cur)
            else:
                positive_nums.append(cur)

        positive_set = set(positive_nums)
        negative_set = set(negative_nums)

        # Find if there is a negative number for every positive number
        if len(zeros) > 0:
            for positive in positive_set:
                negative = positive * -1
                if negative in negative_set:
                    temp = [positive, negative, 0]
                    result.add(tuple(sorted(temp)))

        if len(zeros) >= 3:
            result.add((0, 0, 0))

        # Check for every pair of negative number if there is any positive number
        for first_index in range(len(negative_nums)):
            for second_index in range(first_index + 1, len(negative_nums)):
                positive = -1 * (negative_nums[first_index] + negative_nums[second_index])
                if positive in positive_set:
                    temp = [negative_nums[first_index], negative_nums[second_index], positive]
                    result.add(tuple(sorted(temp)))

        # Check for every pair of positive number if there is any negative number
        for first_index in range(len(positive_nums)):
            for second_index in range(first_index + 1, len(positive_nums)):
                negative = -1 * (positive_nums[first_index] + positive_nums[second_index])
                if negative in negative_set:
                    temp = [positive_nums[first_index], positive_nums[second_index], negative]
                    result.add(tuple(sorted(temp)))

        return result


