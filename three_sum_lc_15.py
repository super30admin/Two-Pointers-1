"""
Name: Srinidhi Bhat
Space Complexity: O(1)
Time Complexity: O(n^2)

Did it run on LC: No 

Logic: 
We can think this of 2 sum where a+b = -c
so we can for every a,b pair find if the c exists in the array

Sorting makes it simpler, as we have to run the loop only for -ve elements
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums)==0:
            return []
        
        nums.sort()
        ans = []
        for i in range(len(nums)):
            if nums[i] <0 :
                for j in range(i,len(nums)):
                    #this is the sum we need
                    rem = - (nums[i]+nums[j])
                    if rem in nums:
                        ans.append([i,j])
        
        print(ans)