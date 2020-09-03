# // Time Complexity : O(n^2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if nums == None or len(nums)==0:
            return []
        
        res = []
        
        nums.sort()
        
        for i in range(len(nums)-2):
            
            #checking if previous element is same, if so then don't do anything and continue
            if i!=0 and nums[i-1] == nums[i]:
                continue
            
            left = i+1
            right = len(nums)-1
            
            while left<right:
                currSum = nums[i]+nums[left]+nums[right]
                
                if currSum ==0:
                    #add to the output array
                    res.append([nums[i], nums[left], nums[right]])
                    
                    # move left and right pointers ahead and back by 1 respectively
                    left +=1
                    right-=1
                    
                    #check for repeating elements 
                    while left<right and nums[left]== nums[left-1]:
                        left +=1
                    while left<right and nums[right]== nums[right+1]:
                        right -=1
                
                elif currSum < 0:
                    #move left as you need to get towards positive axis to get the sum=0
                    left+=1
                    #check your right doesn't cross left and if previous element is same: 
                    #keep moving left
                    while left<right and nums[left]== nums[left-1]:
                        left +=1
                else:
                    #same as above but move towards negative axis this time
                    right -=1
                    while left<right and nums[right]== nums[right+1]:
                        right -=1
                        
        return res
                    
                    
                
                
            
        
          