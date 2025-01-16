# Time Complexity = O(n^2)
# Space Complexity = O(n)
# Approach =  start by sorting the array, which takes and then iterates through each element 
# using an outer loop, skipping duplicates to avoid redundant calculations. For each element, 
# a two-pointer approach is applied to find triplets that sum to zero, adjusting the pointers 
# based on whether the current sum is less than or greater than zero.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)-1):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue 
            l , r = i+1 , len(nums)-1
            while l < r:
                threeSum = nums[i] + nums[l] + nums[r]

                if threeSum > 0:
                    r-=1
                elif threeSum < 0:
                    l += 1
                else:
                    res.append([nums[i],nums[l],nums[r]])
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
        return res