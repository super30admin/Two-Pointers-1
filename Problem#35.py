'''
15. 3Sum
Problem Link: https://leetcode.com/problems/3sum/

'''

# Time Complexity : O(n^2) for the Two Pointers approach
# Space Complexity :  O(1) for the Two Pointers approach
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes, I had to handle duplicates carefully.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # Brute Force
        # Time Complexity: O(n^3)
        # Space Complexity: O(1)
        # n = len(nums)
        # ans = []
        # for i in range(n):
        #     for j in range(i + 1, n):
        #         for k in range(j + 1, n):
        #             if nums[i] + nums[j] + nums[k] == 0:
        #                 ans.append([nums[i], nums[j], nums[k]])
        # return ans

        # Two Pointers
        # Time Complexity: O(n^2)
        # Space Complexity: O(1)
        nums.sort()
        ans = []
        n = len(nums)
        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            left, right = i + 1, n - 1
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if total < 0:
                    left += 1
                elif total > 0:
                    right -= 1
                else:
                    ans.append([nums[i], nums[left], nums[right]])
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1
                    left += 1
                    right -= 1
        return ans