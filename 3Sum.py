# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
For each index, do two pointer search for its complement in the rest of the array.
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        for i in range(len(nums)):
            # Skip duplicates
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            comp = nums[i]*-1

            l = i+1
            r = len(nums)-1

            while l < r:
                if nums[l]+nums[r] == comp:
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    while (l < r and nums[l] == nums[l-1]):
                        l+=1
                    r -= 1
                    while (l < r and nums[r] == nums[r+1]):
                        r-=1
                elif nums[l]+nums[r] < comp:
                    l += 1
                else:
                    r -= 1
            
        
        return result
