"""
Problem: 15. 3Sum
Leetcode: https://leetcode.com/problems/3sum/
Solution: Iterate over given list for each number in the list,
with the help of left and right pointer, find triplets
Time Complexity: O(n^2)
Space Complexity: O(n)
"""


class Solution:
    def threeSum(self, nums):

        result = []
        if nums is None or len(nums) is 0 or len(nums) < 3:
            return result

        nums.sort()
        n = len(nums)

        # Selecting a out of a+b+c
        for i in range(n - 2):
            # checking duplicates for a
            if i > 0 and nums[i - 1] == nums[i]:
                continue
            left = i + 1
            right = n - 1

            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if sum == 0:
                    # Define a inside list with triplets
                    current = [nums[i], nums[left], nums[right]]
                    # Add this triplet to the result array
                    result.append(current)
                    # we can check next while conditions only if we move left and right
                    left += 1
                    right -= 1
                    # Left side duplicates
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    # Right side duplicates
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                # if sum is negative, move towards positive number to get 0
                elif sum < 0:
                    left += 1
                # if sum is positive, move towards negative number to get 0
                else:
                    right -= 1
        return result


obj = Solution()
print(obj.threeSum([-1,0,1,2,-1,-4]))