
from typing import List

"""

    Student : Shahreen Shahjahan Psyche
    Time Complexity : O(N^2)
    Space Complexity : O(1)

"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if not nums or len(nums) < 3:
            return []
        
        nums = sorted(nums)
        res = []
        
        size = len(nums) 
        
        for i in range(0, size-2):
            
            if i>0 and nums[i-1] == nums[i]:
                continue
            if nums[i] > 0:
                break
            low = i + 1
            high = size - 1
            
            while(low < high):  
                val = nums[i] + nums[low] + nums[high]
                if val == 0:
                    res.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while(low < high and nums[low] == nums[low - 1]):
                        low += 1
                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1
                elif val > 0:
                    high -= 1
                else:
                    low += 1
            
            
        return res
            
        