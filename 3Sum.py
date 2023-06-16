# Time Complexity : O(n log(n)) + O(n^2)
# Space Complexity : O(1)

# The code ran on LeetCode

# Sort the input array and loop over each element. At every element, find two elements to its right with sum as -1* current element (run two sum on the remaining array). Put in some extra checks to avoid repetetion

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        res = []; i = 0
        for i in range(n):
            if nums[i] > 0:break
            if i > 0 and nums[i] == nums[i-1]:continue
            l = i+1; r = n-1
            target_sum = 0 - nums[i]

            while l < r:
                if nums[l] + nums[r] == target_sum:
                    res.append([nums[i], nums[l], nums[r]])
                    l+=1
                    r-=1
                    while l < n and nums[l] == nums[l-1]:
                        l+=1
                elif nums[l] + nums[r] > target_sum:
                    r-=1
                else:
                    l+=1
        return res