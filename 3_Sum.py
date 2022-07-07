class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        l=[]
        p=set()
        nums=sorted(nums)
        
        for i in range(len(nums)):
            left=i+1
            right=len(nums)-1
            
            if nums[i]>0:
                break
            
            while left<right:
                s=nums[left]+nums[right]+nums[i]
                if s<0:
                    left+=1
                elif s>0:
                    right-=1
                else:
                    if (nums[i],nums[left],nums[right]) not in p:
                        l.append( [nums[i],nums[left],nums[right]] )
                    
                    p.add((nums[i],nums[left],nums[right]))
                    left+=1
                    right-=1
                    
                    while left<right and nums[left]==nums[left-1]:
                        left+=1
                        
                    while left<right and nums[right]==nums[right+1]:
                        right-=1
                        
        return l
        