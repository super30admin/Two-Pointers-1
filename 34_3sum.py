# S30 Big N Problem #34 {Medium}

# you are given an array (lets say nums) of n integers and there would be 3 values or elements a,b,c in nums such that a+b+c=0 . you need all unique triplets in the array which will give the sum of zero. make sure to not have duplicate triplets in the solution set 

# Time Complexity : O(n^2) n= no. of elements of array
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach 
# Sort the array. 
# Iterate from first element to n-2 elements in array. 
# For the remaining array from this pointer, maintain start and end pointer. 
# Based on their sum, increment or decrement them. 
# if sum of elements at these 3 pointers is 0, add them to result set 


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if len(nums)==0:
            return []
        res=[]
        nums.sort()
        
        index=0
        
        while index<len(nums)-2:
            
            if index>0 and nums[index]==nums[index-1]:
                index+=1
                continue
            
            start=index+1
            end=len(nums)-1
            
            while start<end:
                if nums[index]+nums[start]+nums[end]==0:
                    temp=(nums[index],nums[start],nums[end])
                    res.append(temp)
                    
                    
                    while start<end and nums[start]==nums[start+1]:
                        start+=1
                    
                    while start<end and nums[end]==nums[end-1]:
                        end-=1
                    
                    start+=1
                    end-=1
                    
                elif nums[index]+nums[start]+nums[end]>0:
                    end-=1
                else:
                    start+=1
                    
            index+=1
                    
        return res
            
                    
        