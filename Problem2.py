'''
Problem2 (https://leetcode.com/problems/3sum/)

'''
'''
Time Complexity : O(N^2)

Space Complexity : O(1)
'''
'''
Approach : 
iterate through the array 
p1,p2,p3
perform 2 pointer for p2,p3 with p1

'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        
        result = []
        nums.sort()
        for i in range(len(nums)):
            
            left = i+1
            right = len(nums)-1
            if(i > 0 and i< len(nums) and nums[i-1] == nums[i]):
                continue
            while(left<right):
                
                sumi = nums[i]+nums[left]+nums[right]
                
                if(sumi>0):
                    right = right -1
                    
                    
                elif(sumi<0):
                    left = left + 1
                    
                else :
                    result.append([nums[i],nums[left],nums[right]])
                    left = left + 1
                    right = right -1
                    while(left<right and nums[right] == nums[right +1]):
                        right -= 1
                    while(left<right and nums[left] == nums[left -1]):
                        left += 1

        return result
