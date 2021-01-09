# // Time Complexity : O(n^2)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if(nums==[] or len(nums)==1):
            return []
        nums=sorted(nums)

        result=[]
        for i in range(len(nums)-2):
            if(nums[i]>0):
                break
            if(i>0 and nums[i]==nums[i-1]):
                continue
            low=i+1
            high=len(nums)-1
            while(low<high):
                sum1=nums[i]+nums[low]+nums[high]
                if(sum1==0):
                    result.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while(low<high and nums[low]==nums[low-1]):
                        low=low+1
                    while(low< high and nums[high]==nums[high+1]):
                        high=high-1
                  
                elif(sum1<0):
                    low=low+1
                else:
                    high=high-1
        return result
                
            
        
        