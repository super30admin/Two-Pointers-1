# Time Complexity: O(N^2)
# Space Complexity: O(N)
class Solution:
  def threeSum(self, nums: List[int]) -> List[List[int]]:
    def two_sum(idx, res):
      l, r = idx + 1, len(nums) - 1
      while l < r:
        curr = nums[idx] + nums[l] + nums[r]
        if curr == 0:
          res.append([nums[idx], nums[l], nums[r]])
          l += 1
          r -= 1
          while l < r and nums[l] == nums[l - 1]:
            l += 1
        elif curr > 0:
          r -= 1
        else:
          l += 1
      return res

      
    nums.sort()
    res = []
    for i in range(len(nums)):
      if nums[i] > 0:
        break
      if i != 0 and nums[i] == nums[i - 1]:
        continue
      two_sum(i, res)
    
    return res



  
