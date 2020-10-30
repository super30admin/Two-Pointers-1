class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        result = []
        for i in range(len(nums)-2):
            if nums[i] > 0: break
            if i>0 and nums[i]  == nums[i-1]: continue
            left = i+1
            right = len(nums) - 1
            
            while(left<right):
                tot = nums[i] + nums[left] + nums[right]
                if tot < 0:
                    left+=1
                elif tot > 0:
                    right -=1
                else:
                    result.append([nums[i],nums[left],nums[right]])
                    while(left<right and nums[left] == nums[left+1]): 
                        left+=1
                    while(left<right and nums[right] == nums[right-1]): 
                        right -=1
                    left+=1
                    right-=1
            
            
        return result
                        
        

        
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

'''
        nums = sorted(nums)
        ans = []
        print(nums)
        for i in range(len(nums)-2):
            if nums[i] > 0: break
            if i > 0 and nums[i] == nums[i-1]: continue             
            l = i+1
            r = len(nums) - 1 
            while l<r:
                tot = nums[i] + nums[l] + nums[r]
                if tot < 0:
                    l += 1
                elif tot > 0:
                    r -= 1
                else:
                    ans.append([nums[i] ,nums[l] ,nums[r]])
                    while l<r and nums[l] == nums[l+1]:
                        l += 1
                    while l<r and nums[r] == nums[r -1]:
                        r -=1
                    l += 1
                    r -= 1
        return ans

'''        

            
                        
                    
        