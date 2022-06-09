# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#

# Using Two-Pointers
# TC - O(n^2); SC - 0(1)
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        result = []
        for i in range(len(nums)-2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            start = i + 1
            end = len(nums)-1
            target = (0-nums[i])
            while start < end:
                if nums[start] + nums[end] == target:
                    result.append([target, nums[start], nums[end]])
                    start += 1
                    end -= 1
                    while start < end and nums[start] == nums[start-1]:
                        start += 1
                    while start < end and nums[end] == nums[end+1]:
                        end -= 1
                elif nums[start] + nums[end] > target:
                    end -= 1
                else:
                    start += 1
        return result


check = Solution()
print(check.threeSum([-1, 0, 1, 2, -1, -4]))


# Using Binary Search
# TC : O(n*log(n)) + O(n^2 * log(n)) -- > O(n^2 * log(n)); SC : O(1)
# class Solution:
#     def threeSum(self, nums: list[int]) -> list[list[int]]:
#         nums.sort()
#         result = []
#         for i in range(len(nums) - 2): # fixing 1st element and doing 2-sum using binary search.
#             if i > 0 and nums[i] == nums[i - 1]:
#                 continue
#             if nums[i] > 0:
#                 break
#             targetf = (0 - nums[i])
#             for j in range(i+1, len(nums) - 1):
#                 if j > i + 1 and nums[j] == nums[j - 1]:
#                  # in-order to skip that iteration j should be > than 1st element after i.
#                     continue
#                 start = j + 1
#                 end = len(nums) - 1
#                 target = (targetf - nums[j])
#                 if nums[end] < target: # target not in list, simply skip that iteration
#                     continue
#                 while start <= end:
#                     mid = start + (end - start) // 2
#                     if nums[mid] == target:
#                         result.append([nums[i], nums[j], nums[mid]])
#                         break
#                     elif nums[mid] > target:
#                         end = mid - 1
#                     else:
#                         start = mid + 1
#         return result
#
#
# check = Solution()
# print(check.threeSum([-4, 3, 2, 0, 1, -1, -2, 0, 1, 0, 1, -1, 0, 1, 2, 3]))


# Using HashSet
# TC - O(n^2); SC - O(n)
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
#
# check = Solution()
# print(check.threeSum([-1, 0, 1, 2, -1, -4]))

# Brute-Force
# TC - O(n^3); SC - O(1)
# class Solution:
#     def threeSum(self, nums: list[int]) -> list[list[int]]:
#         dictu = set()
#         for i in range(len(nums)-2):
#             for j in range(i+1, len(nums)-1):
#                 for k in range(j+1, len(nums)):
#                     if nums[i] + nums[j] + nums[k] == 0:
#                         dictu.add(sorted((nums[i], nums[j], nums[k])))
#         return dictu
#
#
# check = Solution()
# print(check.threeSum([0, 0, 0]))
