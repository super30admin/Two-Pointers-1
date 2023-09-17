class Solution:
    def threeSum(self, nums):
        if not nums:
            return []
        nums.sort()
        result = []
        n = len(nums)
        for i in range(n-2):
            if i >0 and nums[i] == nums[i-1]:
                continue
            l = i+1
            r = n-1
            while l < r:
                s = nums[i] + nums[l] + nums[r]
                if s > 0:
                    r -= 1
                elif s < 0:
                    l += 1
                else:
                    result.append([nums[i], nums[l], nums[r]])

                    while l < r and nums[l] == nums[l+1]:
                        l += 1
                    while l < r and nums[r] == nums[r-1]:
                        r -= 1
                    l += 1
                    r -= 1
                    
        return result