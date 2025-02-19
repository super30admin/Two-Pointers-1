'''
// Time Complexity : O(n*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : same implementation as in class

// Your code here along with comments explaining your approach
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        if not nums or len(nums) < 3:
            return result
        n = len(nums)
        nums.sort()
        for i in range(0, n - 2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            l, r = i + 1, n - 1

            while l < r:
                cur = nums[i] + nums[l] + nums[r]
                if cur > 0:
                    r -= 1
                elif cur < 0:
                    l += 1
                else:
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    while nums[l - 1] == nums[l] and l < r:
                        l += 1
        return result