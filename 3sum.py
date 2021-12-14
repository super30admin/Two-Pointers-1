#time complexity: O(n^2)
#time complexity: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums==None or len(nums)==0: return []
        
        result=[]
        n=len(nums)
        nums=sorted(nums)
        print(nums)
        for i in range(n-2):
            if(i>0 and nums[i]==nums[i-1]): continue
            if nums[i]>0: break
            low=i+1
            high=n-1
            
            while(low<high):
                add=nums[i]+nums[low]+nums[high]
                if add==0:
                    result.append([nums[i], nums[low], nums[high]])
                    low+=1
                    high-=1
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                elif add>0:
                    high-=1
                else:
                    low+=1
        return result
                        
                
                    
            