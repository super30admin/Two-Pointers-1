#Time Complexity - O(nlogn + n^2)
#Space Complexity - O(1)
#Successful run on leetcode - NO (Giving me wrong answers)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        res=[]
        n=len(nums)
        nums.sort()
        #total=0
        
        for i in range(0,n-2):
            
            
            left=i+1
            right=n-1
            
            while left<right:
                total=nums[i]+nums[left]+nums[right]
                print("---------")
                print(total)
                
                if total<0:
                    left=left+1
                elif total>0:
                    right=right-1
                else:
                    res.append([nums[i],nums[left],nums[right]])
                    while  left<right and nums[left]==nums[left+1]:
                        left=left+1
            
                    while  left<right and nums[right]==nums[right-1]:
                        right=right-1
                    
                    left=left+1
                    right=right-1
                    print("-----------------")
                    print(res)
            
        return (res)