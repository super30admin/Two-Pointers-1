"""
// Time Complexity : o(n^2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        
        nums = sorted(nums) #sort nums array
        res = []
        i = 0
        
        while i < (len(nums)-2): #for every element 
            
            if i>0:    
                while i<(len(nums)-2) and nums[i] == nums[i-1]: #if already seen, increment i, to take care of duplicates
                    i += 1
            
            j = i+1 
            k = len(nums) - 1
            
            while j < k:
                summ = nums[i] + nums[j] + nums[k]
                
                if summ == 0: #if sum is 0, we found the triplets, so we append to result list and update the pointers
                    res.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1
                    
                    while j<k and nums[j] == nums[j-1]: #if already seen, increment j to take care of duplicates
                        j += 1
                        
                    while j < k and nums[k] == nums[k+1]:
                        k = k-1 #decrement k to take care of duplicates
        
                elif summ < 0: #if sum is lesser we move the low pointer ahead
                    j = j+1
                    
                elif summ > 0: #if sum is greater we move the high pointer behind
                    k = k-1 
            i=i+1
            
        return res