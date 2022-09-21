#Time complexity: O(n*n)
#Space: O(n)

#Approach - 1
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l, r = i+1, len(nums)-1
            while l < r:
                s = nums[i] + nums[l] + nums[r]
                if s < 0:
                    l +=1 
                elif s > 0:
                    r -= 1
                else:
                    res.append((nums[i], nums[l], nums[r]))
                    while l < r and nums[l] == nums[l+1]:
                        l += 1
                    while l < r and nums[r] == nums[r-1]:
                        r -= 1
                    l += 1; r -= 1
        return res
      
      
      
#Approach 2
# class Solution:
#     def threeSum(self, nums: List[int]) -> List[List[int]]:
#         i = 0
#         j = i + 1
#         k = len(nums) - 1
#         result = 0
#         while j < k:
#             if i != j and i != k and j != k:
#                 sum1 = i + j + k
                
#             else:
#                 i = i + 1
#                 j = j
#             result = max(result, sum1) 
#         return result
