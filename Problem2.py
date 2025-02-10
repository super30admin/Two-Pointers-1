# 15. 3Sum

# Time Complexity: O(n^2)
# Space Complexity: O(1)

# Approach:
# Sort the array.
# Mark the current element as the pivot.
# Use two pointers to find the other two elements that sum to 0. Similar to 2Sum II.
# Ensure that the pivot or the other two elements are not duplicates.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        result = []

        for i in range(n):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            l,r = i+1, n-1
            while l<r:
                s = nums[i] + nums[l] + nums[r]
                if s == 0:
                    result.append([nums[i], nums[l], nums[r]])
                    l,r = l+1, r-1
                    while l<r and nums[l] == nums[l-1]:
                        l+=1
                    while l<r and nums[r] == nums[r+1]:
                        r-=1
                elif s > 0:
                    r-=1
                else:
                    l+=1
        return result
        