"""
3Sum - 3 Pointer Approach
Time Complexity : O(n^2)
Space Complexity : O(1)
    
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums or len(nums) < 3:
            return []
        
        
        n = len(nums)
        nums.sort()
        set_ = []
        
        for i in range(n):
            if i != 0 and nums[i] == nums[i-1]: continue
            if nums[i] > 0: break
            l = i + 1 
            h = n - 1

            while l < h:
                sum_ = nums[i] + nums[l] + nums[h]
                
                if sum_ == 0:
                    if [nums[i], nums[l], nums[h]] not in set_:
                        set_.append([nums[i], nums[l], nums[h]])
                    l += 1 
                    h -= 1
                    
                    while l < h and nums[l] == nums[l-1]:
                        l += 1 
                    while l < h and nums[h] == nums[h+1]:
                         h -= 1 
                        
                elif sum_ < 0:
                    l += 1 
                
                else:
                    h -= 1 
        
        return set_
