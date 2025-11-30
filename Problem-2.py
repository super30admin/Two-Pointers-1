# Time Complexity : O(n^2)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
# First sort the array so duplicates can be skipped easily and two-pointer logic works.
# Fix one number at a time and use two pointers (j, k) to find pairs that sum to -nums[i].
# Skip duplicates for all three positions to ensure only unique triplets are added to the result.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        i = 0
        output = []
        nums.sort()
        for i in range(len(nums)-2):
            if i>0 and nums[i] == nums[i-1]:
                continue
            j = i + 1
            k = len(nums)-1
            while j < k:
                sum = nums[i]+nums[j]+nums[k]
                if sum == 0:
                    output.append([nums[i],nums[j],nums[k]])
                    j += 1
                    k -= 1
                    while j<k and nums[j]==nums[j-1]:
                        j += 1
                    while j<k and nums[k] == nums[k+1]:
                        k -=1
                elif sum >0:
                    k -= 1
                else:
                    j += 1
        return output


        