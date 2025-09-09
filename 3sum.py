#Time Complexity: O(N*N)
#Space Complexity : O(1) 

"""
Sort the array so we can use two pointers efficiently.
For each number, fix it and look for two other numbers using low and high pointers.
Skip duplicates to avoid repeating the same triplet in the result.
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #Kanika
        nums.sort()
        result = []
        for i in range(len(nums)):
            if nums[i] > 0:break            
            if i != 0 and nums[i-1] == nums[i]:continue
            j,k= i+1,len(nums) -1
            while(j < k):
                sum = nums[i] + nums[j] + nums[k]
                if sum == 0:
              
                    result.append([nums[i],nums[j],nums[k]])
                    j+=1
                    k-=1
                    while(j < k and nums[j] == nums[j-1]):j+=1
                
                elif sum < 0:
                    j+=1
                else:
                    k-=1         
        return result    
            
       