# Leetcode 15 3-Sum
# Time - O(N2)
# Space - O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        result = []
        
        nums.sort()
        
        for i in range(len(nums)):
            
            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            l = i + 1
            r = len(nums) - 1
            
            while(l < r):
                
                three_sum = nums[l] + nums[r] + nums[i]
                
                if three_sum < 0:
                    
                    l+= 1
                
                elif three_sum > 0:
                    
                    r = r-1
                
                else:
                    
                    result.append([nums[i] , nums[l], nums[r]])
                    l = l + 1
                    # [-2, -2 , 0, 0, 2, 2]
                    
                    while(nums[l] == nums[l - 1] and l < r):
                        
                        l = l + 1
        
        return result
            
                
                
                    
                    
                    
