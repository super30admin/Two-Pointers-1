# Time Complexity : It is O(n) since we are iterating with the list.
# Space Complexity : It is O(n) since are creating the different permutation.
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        finalOutput=[]       
        target=0
        
        for i in range(len(nums)):     
            twoMap = {}       
            target = nums[i] * -1
            for j in range(i+1,len(nums)):
                output = []
                result = target - nums[j]
                if result not in twoMap:
                    twoMap[nums[j]] = nums[j]
                else: 
                    output.append(result)
                    output.append(nums[i])
                    output.append(nums[j])
                    if sorted(output) not in finalOutput:
                        finalOutput.append(sorted(output))  
        return finalOutput        

obj = Solution()
print(obj.threeSum([-1,0,1,2,-1,-4]))
# print(obj.threeSum([0,1,1]))
# print(obj.threeSum([0,0,0]))