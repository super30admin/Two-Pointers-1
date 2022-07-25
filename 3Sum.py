# Time Complexity : O(N^2)  //We are iterating twice where n is the size of the array
#  Space Complexity : O(1)  //We are not using any extra array to sort the colors
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if not nums:
            return[]
        
        n = len(nums)
        #Sort nums first to more easily find duplicate numbers and declare our result list
        nums.sort()
        res = []
        
        #Iterate over nums till we get the desired sum and move the left and right based on the result of sum 
        #if less then move left, if high move our right pointer
        for i in range(n):
            if i>0 and nums[i] == nums[i-1]:
                continue
            left = i+1
            right = n-1
            
            #Start 2pointers
            while left < right:
                sums = nums[i] + nums[left] + nums[right]
                
                if sums == 0:
                    res.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    
                    #Skip all duplicates on left side
                    while left < right and nums[left - 1] == nums[left]:
                        left+=1
                    #Skip all duplicates on right side
                    while left < right and nums[right + 1] == nums[right]:
                        right-=1
                        
                elif sums > 0:
                    right -=1
                else:
                    left += 1
        return res