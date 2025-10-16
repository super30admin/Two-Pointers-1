class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums) - 1):
            if i != 0 and nums[i-1] == nums[i]:
                continue
            if nums[i] > 0:
                break
            l = i + 1
            r = len(nums) - 1
            while(l < r):
                target = nums[i] + nums[l] + nums[r]
                if target < 0:
                    l+=1
                elif target > 0:
                    r-=1
                else:
                    res.append([nums[i], nums[l], nums[r]])
                    l+=1
                    r-=1
                    while l < len(nums) and nums[l-1] == nums[l]:
                        l += 1
        return res