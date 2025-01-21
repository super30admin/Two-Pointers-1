# Time complexity - O(n^2 * logn)
# Space complexity - O(1)

# Approach - Sort the array, loop through the sorted array and have two pointers for array[i+1: n] 

from typing import List
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        result = []
        
        for i in range(len(nums) - 2):
            # outside duplicacy
            if i != 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0: 
                # cannot find negative complement in all positive elements
                break
            
            l = i + 1
            h = len(nums) - 1
            while l < h:
                if nums[i] + nums[l] + nums[h] == 0:
                    result.append([nums[i], nums[l], nums[h]])
                    l += 1
                    h -= 1
                    
                    # inside duplicacy
                    while l < h and nums[l] == nums[l-1]:
                        l += 1
                    while l < h and nums[h] == nums[h+1]:
                        h -= 1
                elif nums[i] + nums[l] + nums[h] < 0:
                    l += 1
                else:
                    h -= 1
        return result