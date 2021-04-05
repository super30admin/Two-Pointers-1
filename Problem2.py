## Problem2 (https://leetcode.com/problems/3sum/)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #BRUTE FORCE 
        # summ=[]
        # temp = []
        # dictionary ={}
        # if len(nums) == 0 or nums==[]:
        #     return []
        # for i in range(len(nums)):
        #     for j in range(len(nums)):
        #         for k in range(len(nums)):
        #             sum = nums[i]+nums[j]+nums[k]
        #             # print(sum)
        #             if sum==0 and i!=j and i != k and j != k:
        #                 temp = [nums[i],nums[j],nums[k]]
        #                 temp.sort()
        #                 if temp not in summ:
        #                     summ.append(temp)
        #                 else:
        #                     continue
        #                 temp =[]
        #             else:
        #                 continue
        # return summ
        
        #OPTIMISED:
        summ = 0
        result = []
        if len(nums) == 0 or nums==[]:
            return []
        nums.sort()
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            low = i+1
            high = len(nums)-1
            while low<high:
                summ = nums[i]+nums[low]+nums[high]
                if summ==0:
                    result.append([nums[i],nums[low],nums[high]])
                    low = low+1
                    high = high-1
                    while low<high and nums[low]==nums[low-1]:
                        low = low+1
                    while low<high and nums[high]==nums[high+1]:
                        high = high-1
                elif summ<0:
                    low = low+1
                else:
                    high = high-1
        return result
    
    #Time Complexity: O(n)
    #Space Complexity: O(1)
    #Approach: loop through the array. 
                    