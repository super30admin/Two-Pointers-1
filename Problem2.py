#3Sum
# Time complexity -> On^2)
# Space complexity -> O1
# Sort the nums, the for each element use 2sum logic to find the numbers which will be equal to -1*element basically then -vs of the element will become
# the target for the 2sum

# from typing import List
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        result=[]
        nums.sort()
        for i in range(0,len(nums)):
            num1 = nums[i]
            if i>0 and nums[i]==nums[i-1]:
                continue
            self.twoSum(nums,i+1,num1*-1,result)
        return result
        
    
    def twoSum(self,nums,startingIndex,target,result):
        # subResult = set()
        leftPointer = startingIndex
        rightPointer = len(nums)-1
        while leftPointer < rightPointer:
            sum = nums[leftPointer] + nums[rightPointer]

            if sum == target:
                result.append([-1*target, nums[leftPointer],  nums[rightPointer]])
                while leftPointer < rightPointer and nums[leftPointer] == nums[leftPointer+1]:
                    leftPointer+=1
                while leftPointer < rightPointer and nums[rightPointer] == nums[rightPointer-1]:
                    rightPointer-=1
                leftPointer+=1
                rightPointer-=1

            elif sum < target:
                leftPointer+=1
            else:
                rightPointer-=1
        
        # return subResult

