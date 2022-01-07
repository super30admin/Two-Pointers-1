class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if(nums==None or len(nums)==0): return []
        newlist =[]
        nums.sort()
        n = len(nums)
        for i in range(n-2):
            if(i!=0 and nums[i]==nums[i-1]): continue
            low = i+1
            high=n-1
            while(low<high):
                sumL =nums[i]+nums[low]+nums[high]
                if(sumL ==0):
                    newlist.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                elif(sumL<0):
                    low+=1
                else:
                    high-=1
        return newlist
                    
                
                
         
            
        