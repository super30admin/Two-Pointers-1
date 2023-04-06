# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we use the two pointer approach after preselecting the first number to form a triplet. 
We also skip duplicate numbers to avoid duplicates in the answer.
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == None or len(nums) == 0:
            return []

        nums.sort()

        answer = []
        n = len(nums)

        for i in range(n):
            if i != 0 and nums[i] == nums[i-1]:
                continue

            low = i + 1
            high = n - 1

            while low< high:
                triplet = nums[i] + nums[low] + nums[high]

                if triplet == 0:
                    answer.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1

                    while low < high and nums[low] == nums[low - 1]:
                        low += 1

                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1

                elif triplet > 0:
                    high -= 1
                else:
                    low += 1

        return answer

        