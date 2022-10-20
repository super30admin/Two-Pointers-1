# TC: O(n^2)
# SC: O(n)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        
        res=[]
        
        for i in range(len(nums)):
            if i>0 and nums[i-1]==nums[i]:
                continue
            
            left,right=i+1,len(nums)-1
            while left<right:
                threeSum=nums[left]+nums[right]+nums[i]
                if threeSum<0:
                    left+=1
                    
                elif threeSum>0:
                    right-=1

                else:
                    res.append([nums[left],nums[right],nums[i]])
                    left+=1
                    while left<right and nums[left]==nums[left-1]:
                        left+=1
        return res