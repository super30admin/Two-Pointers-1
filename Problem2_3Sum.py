# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. Sort the input array.
2. Loop through the array and for every index, set a low pointer and high pointer and find their sum.
3. Increase or decrease the pointers to move the sum towards 0. Finally, return all the triplets whose sum equals 0.
"""


def threeSum(self, nums: List[int]) -> List[List[int]]:
    if not nums or len(nums) is 0:
        return []

    result = []
    length = len(nums)

    # Sort the array
    nums.sort()

    for index in range(length - 2):

        # Skip the repeated element and continue with the next.
        if index > 0 and nums[index] == nums[index - 1]:
            continue

        # For every index, set low and high pointer
        low = index + 1
        high = length - 1

        while low < high:
            sum = nums[index] + nums[low] + nums[high]

            # If sum is 0, append to the result
            if sum == 0:
                result.append([nums[index], nums[low], nums[high]])
                low += 1
                high -= 1

                # Skip the repeated elements
                while low < high and nums[low] == nums[low - 1]:
                    low += 1
                while low < high and nums[high] == nums[high + 1]:
                    high -= 1

            # If sum is less than 0, increase the low pointer to move towards 0.
            elif sum < 0:
                low += 1

            # If sum is greater than 0, decrease the high pointer to move towards 0.
            else:
                high -= 1

    return result



