from typing import List
# Brute Force Solution
# Time Complexity : O(n * n * n)
# Space Complexity : O(n) because of Hashset
# class Solution:
#     def threeSum(self, nums: List[int]) -> List[List[int]]:
#         if nums == None or len(nums) == 0:
#             return []
#         n = len(nums)
#         mySet = set()
#         for i in range(n):
#             for j in range(i+1,n):
#                 for k in range(j+1,n):
#                     if nums[i] + nums[j] + nums[k] == 0:
#                         li = [nums[i], nums[j], nums[k]]
#                         li.sort()
#                         mySet.add(tuple(li))
#         return mySet

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == None or len(nums) == 0:
            return []
        n = len(nums)
        nums.sort()
        result = []
        for i in range(n):
            if i!=0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            left = i+1
            right = n-1
            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if sum == 0:
                    li = [nums[i], nums[left], nums[right]]
                    li.sort()
                    result.append(li)
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                elif sum > 0:
                    right -= 1
                else:
                    left += 1
        return result

obj = Solution()
print(obj.threeSum([-1,0,1,2,-1,-4]))
print(obj.threeSum([]))
print(obj.threeSum([0]))

# Time Complexity = O(n * n)
# Space Complexity = O(1)