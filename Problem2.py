'''

Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach

Sort the array and use the two pointers to find the triplets whose sum equals zero
'''


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums = sorted(nums)

        n=len(nums)
        a = 0
        while a < n-2:
            i = a + 1
            j = n - 1
            while i < j:
                if nums[i] + nums[j] < (nums[a] * - 1):
                    i += 1

                elif nums[i] + nums[j] > (nums[a] * - 1):
                    j -= 1

                else:
                    ans = [nums[a],nums[i],nums[j]]
                    res.append(ans)

                    while i < j and nums[i] == ans[1]:
                        i += 1
                    # while i < j and  nums[j] == ans[2]:
                    #     j -= 1

            while a < n - 2 and nums[a+1] == nums[a]:
                a += 1
            a += 1

        return res