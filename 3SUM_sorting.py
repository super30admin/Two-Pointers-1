# Time Complexity : Add - O(n^2), theta(n^2 + nlogn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. First I have sorted the array, and the use pointers
2. Initially I fix i as my base element pointer, and then move around low(set to i+1) and high to find the remaining pair such that all these nuber add up to 0

3. If a triplet is found increase low and decrease high. Also the dublicate elements is taken care by checking low and high with thier previous values
'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if len(nums) < 3:
            return
        
        triplets = []          
        nums = sorted(nums)
        for i in range(len(nums)-2):
            
            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            low = i+1
            high = len(nums)-1
            
            while (low < high):
                sum_ = nums[i] + nums[low] + nums[high]
                
                if sum_ == 0:
                    triplets.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    
                    while (low < high) and (nums[low] == nums[low-1]):
                        low += 1
                    
                    while (low < high) and (nums[high] == nums[high+1]):
                        high -= 1
                                
                elif sum_ < 0:
                    low += 1                    
                else:
                    high += -1
                    
        return triplets
                    
                
                
                    
            
            
            
            
        

            
            
            
            
            
        
        
