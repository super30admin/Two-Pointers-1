"""
Time Complexity : inside function
Space Complexity :inside function
Did this code successfully run on Leetcode :
Any problem you faced while coding this :

Problem2 (https://leetcode.com/problems/3sum/)

"""

# Approach - 1: Nested iteration
class Solution:
    def threeSum(self, nums):
        """
        Time Complexity : O(N^3), where N is the number of elements in the list
        Space Complexity : O(1)
        """
        if len(nums) == 0: return 0
        m = len(nums) 
        res = set()
        temp = []
      
        for i in range(0, m-2):
             for j in range(i + 1, m-1):
                    for k in range(j + 1,m):
                        if (nums[i] + nums[j] + nums[k] == 0):
                            temp = [nums[i] , nums[j] , nums[k]]
                           
                            temp.sort()
                           
                            res.add(tuple(temp))
                            
                        
        return res
                            
# Approach - 2 
class Solution:
    def threeSum(self, nums):
        """
        Using hashmap to store the difference of each number and storing it in hashset to avoid duplicate
        Time Complexity : O(N^2)
        Space Complexity : O(N)
        """
        if len(nums) == 0: return 0
        
        res = set()
        n = len(nums)
        
        for i in range(0,n-2):
            # taking difference from the first iteration elements
            diff = 0 - nums[i]
            # Inititalizing hash_map inside the for loop as we do not want elements from same indexes
            map_index = {}
            for j in range(i + 1, n):
                # taking difference in second iteration of elements
                target = diff - nums[j]
                if target in map_index.keys():
                    temp = [nums[i] , target ,nums[j] ]
                    temp.sort()
                    res.add(tuple(temp))
    
                map_index[nums[j]] = j
                    
        return res  


# Approach - 3

class Solution:
    def threeSum(self, nums):
        """
        Two pointer solution, taking outer loop for fixing one value then using two sum with the rest of the array.
        taking low ptr as i + 1 and High as len(nums) - 1.
        This is the best case
        Time Complexity : O(N^2)
        Space Complexity : O(1)
        """
        if len(nums) == 0: return 0
        
        res = []
        #sort the array first
        nums.sort()
        
        for i in range(len(nums)- 2):
            # Check for duplicate values in outer loop
            if (i != 0 and nums[i] == nums[i - 1]): continue
                
            low_ptr = i + 1
            high_ptr = len(nums) - 1
            
            while low_ptr < high_ptr:
                _sum = (nums[i] + nums[low_ptr] + nums[high_ptr])
                if _sum == 0:
                    res.append([nums[i] , nums[low_ptr] , nums[high_ptr]])
                    low_ptr += 1
                    high_ptr -= 1
                    
                    #check to remove duplicate values from inner loop
                    while( low_ptr < high_ptr and (nums[low_ptr] == nums[low_ptr - 1])):
                        low_ptr += 1
                    while( low_ptr < high_ptr and (nums[high_ptr] == nums[high_ptr + 1])):
                        high_ptr -= 1
                
                elif _sum > 0:
                    high_ptr -= 1
                else:
                    low_ptr += 1
        
 
        return res 

# Approach - 4

class Solution:
    def threeSum(self, nums):
        """
        Using Binary search with two pointers
        Time Complexity : O(N^2logn)
        Space Complexity : O(1)

        """
        if len(nums) == 0: return 0
        
        res = set()
        #sort the array first
        nums.sort()
        
        for i in range(len(nums)- 2):
            # Check for duplicate values in outer loop
            if (i != 0 and nums[i] == nums[i - 1]): continue
            for j in range(i + 1, len(nums)): 
                if (j != (i + 1) and nums[j] == nums[j - 1]): continue
                low_ptr = j + 1
                high_ptr = len(nums) - 1
                _sum = 0 - nums[i] - nums[j]
            
            
                while low_ptr <= high_ptr:
                    mid = (low_ptr + high_ptr)//2
                    
                    if nums[mid] == _sum:
                        res.add((nums[i] , nums[j] , nums[mid]))
                        low_ptr += 1
                        high_ptr -= 1
                                    
                        #check to remove duplicate values from inner loop
                        while( low_ptr < high_ptr and (nums[low_ptr] == nums[low_ptr - 1])):
                            low_ptr += 1
                        while( low_ptr < high_ptr and (nums[high_ptr] == nums[high_ptr + 1])):
                            high_ptr -= 1

                    elif _sum < nums[mid]:
                        high_ptr -= 1
                    else:
                        low_ptr += 1

 
        return res