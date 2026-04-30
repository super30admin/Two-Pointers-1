# Time Complexity : O(n^2)
# Space complexity :O(1) auxilary space.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Sort the array and iterate, keeping one element fixed, if fixed element is greter than 0 stop instantly.
# For each fixed element, use two pointer approach to find the other two elements, if sum is greater than 0 move right pointer, if sum is less than 0 move left pointer, if sum is 0 add the triplet to result and move both pointers.

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        nums.sort()
       
        for i,value in enumerate(nums):
            # outside duplicate check
            if i > 0 and value == nums[i - 1]:
                continue
            if value > 0:
                break
            l = i + 1
            r = len(nums) - 1
            while l < r:
                res_sum = value + nums[l] + nums[r]
                if res_sum > 0:
                    r -= 1
                elif res_sum < 0:
                    l +=1
                else:
                    result.append([value,nums[l],nums[r]])
                    l +=1
                    r -=1
                    # to avoid duplicate values oterate until unique element
                    while nums[l] == nums[l - 1] and l < r:
                        l +=1
                    while nums[r] == nums[r + 1] and l < r:
                        r -= 1
        return result   