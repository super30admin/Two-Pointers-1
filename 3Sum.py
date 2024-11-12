# Approach:
# First, sort the array to facilitate finding unique triplets and use a two-pointer technique.
# For each element in the array, set it as a target, and use two pointers to find pairs that sum up to the negative of the target.
# Skip duplicates by moving the pointers to avoid adding duplicate triplets to the result.

# Time Complexity: O(n^2), where n is the number of elements in nums
# Space Complexity: O(1) (ignoring the space used for the result, as it does not count as extra space for this in-place calculation)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()  # Sort the array to manage duplicates and use two-pointer technique
        result = []

        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:  # Skip duplicates for the current number
                continue
            
            left, right = i + 1, len(nums) - 1  # Initialize two pointers
            
            while left < right:
                three_sum = nums[i] + nums[left] + nums[right]
                
                if three_sum < 0:
                    left += 1  # Move left pointer to increase sum
                elif three_sum > 0:
                    right -= 1  # Move right pointer to decrease sum
                else:
                    # Found a triplet
                    result.append([nums[i], nums[left], nums[right]])
                    
                    # Skip duplicates for left and right pointers
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1
                    
                    # Move pointers after finding a valid triplet
                    left += 1
                    right -= 1
        
        return result
