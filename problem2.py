
# Time Complexity : O(N ^2), 
# Space Complexity : 0(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums ==None or len(nums)==0 :
            return []
        result =[]
       
        n=len(nums)
        nums.sort()
        for i in range(n-2):
            if i >0 and nums[i]==nums[i-1]:
                continue
            if nums[i]>0:
                break
            l = i+1
            h = n-1
            while (l<h):
                sums = nums[i] +nums[l]+nums[h]
                if sums ==0:
                    li = [nums[i],nums[l],nums[h]]
                    result.append(li)
                    l+=1
                    h-=1
                    while l<h and nums[l]==nums[l-1]:
                        l+=1
                    while l<h and nums[h]==nums[h+1]:
                        h-=1
                elif sums>0:
                    h-=1
                else:
                    l+=1
                    
            
                        
        return result
                
        