class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        for i in range(len(nums)):
            if nums[i] > 0: 
                break 
            if i >0 and nums[i-1] == nums[i]: 
                continue
            l = i + 1 
            r = len(nums)-1
            while l < r:
                if nums[i] + nums[l] + nums[r] == 0:
                    res.append([nums[i], nums[l], nums[r]])
                    l += 1 
                    r -= 1 
                    while (nums[l-1] == nums[l] and l < r):
                        l += 1 
                elif nums[i] + nums[l] + nums[r] > 0:
                    r -= 1 
                else: 
                    l += 1
        return res

# The algorithm sorts the array first, then fixes one number (nums[i]) and uses a two-pointer approach (l and r) to find pairs that sum to -nums[i]. Duplicates are skipped to avoid repeating triplets. Sorting ensures we can move pointers efficiently based on the current sum.
# Time: O(n^2)
# Space: O(1)