"""
Intuition: 3 Sum = Iterative 2 Sum

To get all possible solutions we can keep on iterating till we get sum = 0
#####################################################################
Time Complexity : O(N*N)  N = number of elements
Space Complexity : O(1) 
#####################################################################
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            low = i + 1
            high = len(nums) -1
            while low < high:
                total = nums[low] + nums[high] + nums[i]
                if total == 0:
                    result.append( [nums[i], nums[low],nums[high]])  
                    low += 1
                    high -=1
                    while low < high and nums[low]== nums[low-1]:
                        low += 1
                    while low < high and nums[high]== nums[high+1]:
                        high -= 1
                elif total <0:
                    low += 1
                else:
                    high -= 1
        
        
        return result
                    