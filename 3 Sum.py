# // Time Complexity :O(n2)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :NO


# // Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        n = len(nums)
        for i in range(n - 2):
            if i > 0 and (nums[i] == nums[i - 1]):
                continue
            l = i + 1
            h = n - 1

            while l < h:
                sum1 = nums[i] + nums[l] + nums[h]
                if sum1 == 0:
                    res.append([nums[i], nums[l], nums[h]])

                    l += 1
                    h -= 1
                    while l < h and (nums[l] == nums[l - 1]):
                        l += 1
                    while l < h and (nums[h] == nums[h + 1]):
                        h -= 1
                elif sum1 > 0:
                    h -= 1
                elif sum1 < 0:
                    l += 1
        return res
