# time complexity - O(n^2) -- best solution
# Space complexity - O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # 2pointers solution
        nums.sort()
        n = len(nums)
        result = []
        for i in range(n-2):
            if i>0 and nums[i] == nums[i-1]: continue
            left = i+1 
            right = n - 1
            while (left < right):
                total = nums[left] + nums[right] + nums[i]
                if  total == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    # check the base case might cause an index out of bounds error
                    while (left < right and nums[left-1] == nums[left]):
                        left += 1
                    # check the base case
                    while (left < right and  nums[right] == nums[right + 1]):
                        right -= 1
                elif  total < 0:
                    left += 1
                else:
                    right -= 1
        return result     






