class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # 2 pointer approach
        # TC : O(n**2)
        # SC : O(1) 
        if nums is None or len(nums) == 0:
            return []
        n = len(nums)
        res = []
        nums.sort()
        for i in range(n):
            if i>0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            left,right = i+1,n-1
            while left < right:
                sumv = nums[i]+nums[left]+nums[right]
                if sumv == 0:
                    res.append([nums[i],nums[left],nums[right]])
                    left += 1
                    right -= 1
                    while left <= right and nums[left] == nums[left-1]:
                        left += 1
                    while left <= right and nums[right] == nums[right+1]:
                        right -= 1
                elif sumv < 0:
                    left += 1
                else:
                    right -= 1
        return res
        