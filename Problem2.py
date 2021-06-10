# Time Complexity : O(n**2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#sorting the array and applying two sum by maintaining an iterator

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 0:
            return []
        nums = sorted(nums)
        n = len(nums)
        i = 0
        result = []
        while i < n-2:
            j = i+1
            k = n-1
            while j < k:
                if nums[i] + nums[j] + nums[k] == 0:
                    result.append([nums[i],nums[j],nums[k]])
                    j += 1
                    k -= 1
                    while j<k and nums[j] == nums[j-1]:
                        j+=1
                    while j<k and nums[k] == nums[k+1]:
                        k-=1
                elif nums[i] + nums[j] + nums[k] < 0:
                    j+=1
                else:
                    k-=1
            i+=1
            while i < n-2 and nums[i] == nums[i-1]:
                i += 1
        return result