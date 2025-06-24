# Time Complexity: O(n^2)
# Space Complexity: O(n) worse case
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

# So iterating through each element and taking two pointers one at i+1 and other at last.
# calculate sum of current element and low and high see if that equals or > or < target sum that is zero
# If equals zero append else < increment low 
# If > decrement high 

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()  # Sort the list

        for i, a in enumerate(nums):
            if i > 0 and a == nums[i - 1]:
                continue  # Skip duplicate elements for the first number

            low, high = i + 1, len(nums) - 1 # Two pointers
            while low < high:
                threeSum = a + nums[low] + nums[high]

                if threeSum > 0:
                    high -= 1
                elif threeSum < 0:
                    low += 1
                else:
                    result.append([a, nums[low], nums[high]])
                    low += 1
                    high -= 1
                    # Skip duplicates for the second and third numbers
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1

        return result