# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach: Sort the nums array so as to skip the duplicates. Then loop through
#each element and then do a two sum with two pointers on the remaining elements(basically sum to 0 including the current element)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0: continue
            if (i > 0 and nums[i] == nums[i-1]): continue
            left = i + 1
            right = len(nums) -1
            while(left < right):
                currValue = nums[i] + nums[left] + nums[right]
                if currValue == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while(left < right and nums[left] == nums[left-1]):
                        left += 1
                    while(left < right and nums[right] == nums[right+1]):
                        right -= 1
                elif currValue > 0:
                    right -= 1
                else:
                    left += 1

        return result