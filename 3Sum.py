#Sorting and Two pointers
""""// Time Complexity : O(n^2)+O(nlogn)=O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""
class Solution:
    def threeSum(self, nums):

        result = []
        if not nums or len(nums) == 0:
            return result
        n = len(nums)
        nums.sort()
        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            if nums[i] > 0:
                break
            low = i + 1
            high = n - 1
            while (low < high):
                if nums[i] + nums[low] + nums[high] == 0:
                    l = [nums[i], nums[low], nums[high]]
                    result.append(l)
                    low += 1
                    high -= 1
                    while (low < high and nums[low] == nums[low - 1]):
                        low += 1
                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1
                elif nums[i] + nums[low] + nums[high] > 0:
                    high -= 1
                else:
                    low += 1
        return result
Obj=Solution()
print(Obj.threeSum([-1,0,1,2,-1,-4]))




#Sorting and Binary Search
""""// Time Complexity : O(n^2* logn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
"""

# class Solution:
#     def threeSum(self, nums):
#         nums.sort()
#         result = []
#         for i in range(len(nums) - 2):
#             if i > 0 and nums[i] == nums[i - 1]:
#                 continue
#             if nums[i] > 0:
#                 break
#             tar1 = (0 - nums[i])
#             for j in range(i+1, len(nums) - 1):
#                 if j > i + 1 and nums[j] == nums[j - 1]:
#                 l = j + 1
#                 r = len(nums) - 1
#                 tar2 = (tar1 - nums[j])
#                 if nums[r] < tar2:
#                     continue
#                 while l <= r:
#                     mid = l + (r - l) // 2
#                     if nums[mid] == tar2:
#                         result.append([nums[i], nums[j], nums[mid]])
#                         break
#                     elif nums[mid] > tar2:
#                         r = mid - 1
#                     else:
#                         l = mid + 1
#         return result
#
#
# check = Solution()
# print(check.threeSum([-4, 3, 2, 0, 1, -1, -2, 0, 1, 0, 1, -1, 0, 1, 2, 3]))


# Hashmap(By Two Sum)
""""// Time Complexity : O(n^2)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
"""
# class Solution:
#     def threeSum(self, nums: list[int]) -> list[list[int]]:
#         result = set()
#         for i in range(len(nums)-1):
#             target = (0 - nums[i])
#             two_sum = set()
#             for j in range(i+1, len(nums)):
#                 if target - nums[j] in two_sum:
#                     result.add(tuple(sorted((nums[i], nums[j], (target-nums[j])))))
#                 two_sum.add(nums[j])
#         return list(result)
#
# Obj=Solution()
# print(Obj.threeSum([-1,0,1,2,-1,-4]))




#Brute Force
""""// Time Complexity : O(n^3)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""
# class Solution:
#     def threeSum(self, nums):
#         hashset = set()
#         l=[]
#
#         for i in range(len(nums)):
#             for j in range(i + 1, len(nums)):
#                 for k in range(j + 1, len(nums)):
#                     if nums[i] + nums[j] + nums[k] == 0:
#
#                         l = tuple(sorted( [nums[i] , nums[j] , nums[k]]))
#                         hashset.add(l)
#
#
#         return hashset
# Obj=Solution()
# print(Obj.threeSum([-1,0,1,2,-1,-4]))
