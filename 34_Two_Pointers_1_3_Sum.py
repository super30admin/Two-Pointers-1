#Time Complexity : O(n^2) 
#Space Complexity : O(1) 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : 

#Your code here along with comments explaining your approach

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums=sorted(nums)
        res=[]
        k=0
        for i in range (len(nums)-2): 
            if i!=0 and nums[i]==nums[i-1]: 
                continue
            left=i+1
            right=len(nums)-1
            
            while left<right: 
                cursum=nums[i]+nums[left]+nums[right]
                res2=[]
                if cursum==0: 
                    res2.append(nums[i])
                    res2.append(nums[left])
                    res2.append(nums[right])
                    
                    res.append(res2)
                   
                    left+=1
                    while left<right and nums[left]==nums[left-1]: 
                        left+=1
             
                    right-=1
                    while left<right and nums[right]==nums[right+1]: 
                        right-=1
                
                elif cursum<0: 
                    left+=1
                    while left<right and nums[left]==nums[left-1]: 
                        left+=1
                else: 
                    right-=1
                    while left<right and nums[right]==nums[right+1]: 
                        right-=1
                
            
        return res                
                    
                    