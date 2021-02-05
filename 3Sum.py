# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if not nums and len(nums)<3:
            return []
        
        ans=[]
        nums.sort()
        
        for x in range(len(nums)-2):
            if x != 0 and nums[x-1]==nums[x]:
                continue
            
            l=x+1
            r=len(nums)-1
            
            while l<r :
                sum = nums[x]+nums[l]+nums[r]
                
                if sum == 0:
                    ans.append([nums[x],nums[l],nums[r]])
                    l+=1
                    r-=1
                
                    while(l<r and nums[l-1]==nums[l]):
                        l+=1
                    while(l<r and nums[r+1]==nums[r]):
                        r-=1
                    
                elif sum >0:
                    r-=1
                    while(l<r and nums[r+1]==nums[r]):
                        r-=1
                else:
                    l+=1
                    while(l<r and nums[l-1]==nums[l]):
                        l+=1
                        
        
        return ans
                
            
        
        
        