## Problem2 (https://leetcode.com/problems/3sum/)

# TC : O(n^2), where n is the length of nums

# SC : O(1) excluding the output array

# Approach:
    # Sort the array to enable two-pointer approach
    # Sorting takes O(n log n) time

# Did this code successfully run on Leetcode : YES


def threeSum(nums):
    # Sort the array to enable two-pointer approach
    # Sorting takes O(n log n) time
    nums.sort()
    result = []
    n = len(nums)
    
    # Iterate through each element as potential first element of triplet
    # This loop runs in O(n) time
    for i in range(n):
        # Skip duplicates for the first element to avoid duplicate triplets
        if i > 0 and nums[i] == nums[i-1]:
            continue
            
        # Use two-pointer technique to find pairs that sum to -nums[i]
        left, right = i + 1, n - 1
        target = -nums[i]
        
        # Two-pointer loop runs in O(n) time
        while left < right:
            current_sum = nums[left] + nums[right]
            
            if current_sum < target:
                # Sum is too small, move left pointer to increase sum
                left += 1
            elif current_sum > target:
                # Sum is too large, move right pointer to decrease sum
                right -= 1
            else:
                # Found a triplet that sums to zero
                result.append([nums[i], nums[left], nums[right]])
                
                # Skip duplicates for the second element
                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                # Skip duplicates for the third element
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1
                    
                # Move both pointers inward to find more potential triplets
                left += 1
                right -= 1
                
    return result