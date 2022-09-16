"""
 FAANMG Problem #35 {Medium}



15. 3Sum

Time Complexity : O(N^2)

Space Complexity : O(N)


Did this code successfully run on Leetcode : Yes
  

Here we are iterating through each ekement and performing 2 sum on the remaing numbers.

For 2 sum:
     We are maintaining a hashmap whre we are checking if the compliment of the target is present ?
     
     IF yes, then we have found a triplet and adding it in result
     else adding the number to tne temp hashmap
     
     

@name: Rahul Govindkumar_RN27JUL2022
"""


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        result = set()
        
        comp_hashmap = {}
        
        n = len(nums)
        
        for i in range(n-2):
            
            target = 0 - nums[i]
            comp_hashmap = {}
            for j in range(i+1, n):
                
                
                complement = target - nums[j]
                
                if (complement in comp_hashmap ):
                    
                    s = [nums[i] , nums[j] , complement]
                    s.sort()
                    
                    u = tuple(s)
                    result.add(u)
                else:
                    comp_hashmap[nums[j]]=j
                    
        return result
 

"""
 FAANMG Problem #35 {Medium}


15. 3Sum

Time Complexity : O(N^2)

Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
  

Two pointer Logic
Here we are iterating through each element and performing two pointer on the remaining numbers.

For 2 pointer:
    First we are sorting the array
     We are using low =i+1 and high to last element
     looping untill the pointer cross and finding the sum
     
     tempSum = nums[i] + nums[low] + nums[high]  
     
    

@name: Rahul Govindkumar_RN27JUL2022
"""




class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        
                
        if(len(nums)==0):
            return[]
        hashset=set()
        
        n = len(nums)
        
        nums.sort()
        
        
        for i in range(n-2):
            
            if(i != 0 and nums[i]==nums[i-1]):
                continue
                
            low = i+1
            high = n-1
            
            while(low < high):
                
                tempSum = nums[i] + nums[low] + nums[high]  
                
                #triplets found
                if(tempSum == 0):
                    hashset.add((nums[i] , nums[low] , nums[high]))
                    low += 1
                    high -= 1
                    
                    #to exclude repeated numbers
                    while( low < high and nums[low] == nums[low-1]):
                        low +=1
                        
                    while( low < high and nums[high] == nums[high+1]):
                        high -=1
                    
                elif( tempSum > 0):
                    high -=1
                else:
                    low +=1
                
            
            
                    
        return list(hashset)  


"""
 FAANMG Problem #35 {Medium}


15. 3Sum

Time Complexity : O(N^2 logn)

Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
  

Binary Search Logic
Here we are iterating through each element and performing two pointer on the remaining numbers.


- First we are sorting the array
- for every ith and i+1 then we are performing binary search on the remaining list
 
     
    

@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        result = set()
        

        
        n = len(nums)
        nums.sort()
        
        for i in range(n-2):
            if i!= 0 and nums[i] == nums[i-1]:
                    continue
            
            

            for j in range(i+1, n-1):
                
                if j!= i+1 and nums[j] == nums[j-1]:
                    continue
                
                
                
                target = 0 - nums[i] - nums[j]
                
                low = j+1
                high = n-1
                
                while( low <= high ):
                    mid = (low + high)//2
                    
                    if(nums[mid] == target):
                        
                        result.add((nums[i] , nums[j] , nums[mid]))
                        break
                        
                    if( nums[mid] > target):
                        high = mid-1
                        
                    else:
                        low = mid+1
                        
                    
                        
                
                
                    
        return result
                    
                                  