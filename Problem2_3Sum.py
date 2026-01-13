# Time Complexity : O(n^2) where n is the length of the array
# Space Complexity : O(1) excluding the output array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Sort the array first, then for each element, use two pointers to find pairs that sum to negative of current element.
# Skip duplicates at each level (outer loop, left pointer, right pointer) to avoid duplicate triplets.
# Move pointers based on sum comparison: if sum < 0, move left forward; if sum > 0, move right backward.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        n = len(nums)
        
        for i in range(n - 2):
            # Skip duplicates for the first element
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            
            left = i + 1
            right = n - 1
            
            while left < right:
                current_sum = nums[i] + nums[left] + nums[right]
                
                if current_sum == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    
                    # Skip duplicates for left pointer
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    # Skip duplicates for right pointer
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1
                    
                    left += 1
                    right -= 1
                elif current_sum < 0:
                    left += 1
                else:
                    right -= 1
        
        return result

