# Time: O(n^2)
# Space: O(1)
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        ans = []
        for i in range(len(nums)):
            j = i+1
            k = len(nums) - 1
            while j<k:
                if nums[i]+nums[j]+nums[k] == 0:
                    if [nums[i], nums[j], nums[k]] not in ans:
                        ans.append([nums[i], nums[j], nums[k]])
                    j += 1
                elif nums[i]+nums[j]+nums[k] < 0:
                    j += 1
                else:
                    k -= 1
        return ans
        
