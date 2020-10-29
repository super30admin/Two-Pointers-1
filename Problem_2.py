"""
Time Complexity : O(n^2) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
This question is an extended version of two pointer approach. We first sort the array which has O(nlogn)
complexity. Here we traverse through the array once,and at each point, we take nums[i] as the first value, 
and from i to len(nums), we check which two numbers in addition to nums[i], will make the sum 0. This inner 
while loop follows the 2 pointer approach. 
"""


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums:
            return []
        result = []
        nums.sort()
        n = len(nums)
        for i in range(0, n-2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            a = nums[i]
            b = i+1
            c = n-1
            while b < c:
                summ = a+nums[b]+nums[c]
                if summ == 0:
                    result.append([a, nums[b], nums[c]])
                    b += 1
                    c -= 1
                    while b < c and nums[b] == nums[b-1]:
                        b += 1
                    while b < c and nums[c] == nums[c+1]:
                        c -= 1
                elif summ < 0:
                    b += 1
                elif summ > 0:
                    c -= 1
        return(result)
