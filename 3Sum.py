# Time Complexity - O(N^2)

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : No

# Any problem you faced while coding this : No

# Approach
# For each element I run a loop where I find the two elements using pointers low and high that when added to the element
# give the target.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        if nums == None or len(nums) == 0:
            return None

        nums.sort()

        result = []
        if (nums[0] > 0):
            return result

        for i in range(0, len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            low = i + 1
            high = len(nums) - 1
            while low < high:
                sum = nums[i] + nums[low] + nums[high]

                if sum == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while (low < high and nums[low] == nums[low - 1]):
                        low += 1
                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1

                elif sum < 0:
                    low += 1
                else:
                    high -= 1

        return result




