// Time Complexity : O(n*n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        
        result=[]
        
        for i in range(0,len(nums)):
            
            if i!=0 and nums[i]==nums[i-1]:
                continue
            
            l=i+1
            r=len(nums)-1
            
            while(l<r):
                currsum= nums[i] +nums[l]+nums[r]
                
                if currsum==0:
                    
                    temp=[nums[i],nums[l],nums[r]]
                    temp.sort()
                    result.append(temp)
                    
                    l=l+1
                    r=r-1
                    
                    while(l<r and nums[l]==nums[l-1]):
                        l=l+1
                    
                    while(l<r and nums[r]==nums[r+1]):
                        r=r-1
                elif currsum<0:
                    l=l+1
                else:
                    r=r-1
        return result
                