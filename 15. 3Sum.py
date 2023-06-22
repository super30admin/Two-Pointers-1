# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n^2)
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Forming solution of increament l,r continuously if same no. got repeated.

class Solution:
    '''
    - Divide into two parts: select one number and combine it with two sum solution for rest two nos.
    - Iterate over array for first no. Hash solution for rest two sum is avoided due to O(n) space complexity.
    - Use two pointer solution for two sum to solve in O(1) space complexity.
    '''
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if (nums == None or len(nums) < 3):
            return []
        result = []
        nums.sort()
        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            val = 0 - nums[i]
            l = i + 1
            r = len(nums) - 1
            while (l < r):
                if (nums[l] + nums[r]) == val:
                    result.append([nums[i], nums[l], nums[r]])
                    r -= 1
                    l += 1
                    while(l < r and nums[r] == nums[r + 1]):
                            r -= 1
                    while(l < r and nums[l] == nums[l - 1]):
                            l += 1
                elif (nums[l] + nums[r]) > val:
                        r -= 1
                elif (nums[l] + nums[r]) < val:
                        l += 1
        return result