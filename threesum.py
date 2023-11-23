class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums.sort()
        for i in range(0,len(nums)):
            if nums[i]>0:
                break
            elif i!=0 and nums[i]==nums[i-1]:
                continue
            low=i+1
            high=len(nums)-1
            while(low<high):
                sums= nums[i]+nums[low]+nums[high]
                if sums>0:
                    high-=1
                elif sums<0:
                    low+=1
                else:
                    temp = [nums[i],nums[low],nums[high]]
                    res.append(temp)
                    low+=1
                    high-=1
                    while (low<high and nums[low]==nums[low-1]):
                        low+=1
                    while (low<high and nums[high]==nums[high+1]):
                        high-=1
                    
        
        return res
                    
                
            
        