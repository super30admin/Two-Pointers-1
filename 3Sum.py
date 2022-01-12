# Time Complexity :
# O(n^2)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english

# here for each element we will try to find sum of two other element(say 2sum) such that the sum of element 
# and 2 sum is zero
# Two find this 2sum we can use any approach to find 2sum but i have used 2 pointer approach here
# as if we use two pointer approach we dont have to maintain any hasgmap which save memomry
# Since we have to return unique combinations which can be done by manipulating positions of pointers

# Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        result = []
        
        if (nums == None or len(nums) < 3):
            return result
        
        nums.sort()
        
        low = 1
        high = len(nums) - 1
        
        for i in range(len(nums)):
            
            # Save Outside Duplicacy
            if (i != 0 and nums[i] == nums[i-1]):
                continue
            
            # Two Pointer        
            low = i+1
            high = len(nums)-1
            
                
            while (low < high):
                
                sum = nums[i]+nums[low]+nums[high]
                if (sum == 0):
                    triplet = [nums[i], nums[low], nums[high]]
                    result.append(triplet)
                    low += 1
                    high -= 1
                    
                    # Save Internal Duplicacy
                    while (low < high and nums[low] == nums[low-1]):
                        low+=1
                        
                    while (low < high and nums[high] == nums[high+1]):
                        high-=1
                        
                elif (sum > 0):
                    high -= 1
                else:
                    low += 1
                    
        return result