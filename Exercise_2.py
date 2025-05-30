# Problem #35 3Sum
#LeetCode https://leetcode.com/problems/3sum/description/

# Author : Akaash Trivedi
# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# sort the array and use two pointers (possible with binary search as well)
# use i-th index as target and left + right to match the target
# to avoid dublicates check if previous element is the same then skip

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result =[]
        n = len(nums)

        for i in range(n):
            if i!=0 < n and nums[i] == nums[i-1]:
                continue
            l = i +1
            r = n - 1
            x = -nums[i] # this is target
            while l < r:
                if x == (nums[l] + nums[r]):
                    result.append([nums[i],nums[l],nums[r]])
                    l+=1
                    r-=1
                    while l < r and nums[l] == nums[l-1]:
                        l+=1
                elif x < (nums[l] + nums[r]):
                    r-=1
                else:
                    l+=1
        return result 