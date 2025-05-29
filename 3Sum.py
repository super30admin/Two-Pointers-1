# // Time Complexity : for hash o(n2) for two pointers o(n2)
# // Space Complexity : hashing o(n) for pointers o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : developing intuition for 2 pointers


# // Your code here along with comments explaining your approach
# for hashing idea is to apply two sum by fixing one element basically searching complements in the array, here we are not counting duplicates by storing in two hashsets
# for two pointers again we fix one element and apply 2 sum with 2 pointers to avoid duplicates we ignore caluclating two sum for repeated elements

from typing import List
# class Solution:
#     def threeSum(self, nums: List[int]) -> List[List[int]]:
#         def check_all_zeros(arr):
#             return all(x == 0 for x in arr) 
#         if check_all_zeros(nums):
#             return [[0,0,0]]           
#         n, res, resultSet =  len(nums), [], set()
#         complement, target = 0, 0
#         for i in range(0,n-2):
#             hashSet = set()
#             target = 0-nums[i]
#             for j in range(i+1, n):
#                 complement = target - nums[j]
#                 if complement in hashSet:
#                     ans = sorted([nums[i],nums[j],complement])
#                     resultSet.add(tuple(ans))
#                 else:
#                     hashSet.add(nums[j])
#         return list(resultSet)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums, n, res = sorted(nums), len(nums), []
        for i in range(0,n-2):
            if nums[i] > 0 : break
            if i!=0 and nums[i] == nums[i-1]: continue
            l,h = i+1, n-1 
            while l<h:
                currSum = nums[i] + nums[l] +nums[h]
                if currSum == 0:
                    res.append([nums[i], nums[l], nums[h]])
                    l+=1
                    h-=1
                    while l<h and nums[l] == nums[l-1]:
                        l+=1
                    while l<h and nums[h] == nums[h+1]:
                        h-=1
                elif currSum  > 0:
                    h-=1
                else:
                    l+=1
        return res

                
                