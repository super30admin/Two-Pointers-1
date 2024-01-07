class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []
        for i in range(len(nums)):
            if i>0 and nums[i-1] == nums[i]:
                continue
                
            j = i + 1
            k = len(nums) - 1
            
            while(j<k):
                
                if nums[i] + nums[j] + nums[k] > 0:
                    k = k - 1
                    
                elif nums[i] + nums[j] + nums[k] < 0:
                    j = j + 1
                    
                else:
                    ans.append([nums[i],nums[j],nums[k]])
                    j = j + 1
                    
                    while nums[j-1] == nums[j] and j<k:
                        j = j + 1
                        
        return ans
                        
                
