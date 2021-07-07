#
# Time Complexity = O(n^2)
# Space Complexity = O(1)
#
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []

        for i in range(len(nums)-2):
            target = -nums[i]
            if i != 0 and nums[i] == nums[i-1]:
                continue
            print(i)
            l = i+1
            u = len(nums)-1
            while l < u:
                if nums[l]+nums[u] == target:
                    res.append([nums[i], nums[l], nums[u]])
                if nums[l]+nums[u] > target:
                    curr = nums[u]
                    while l < u and nums[u] == curr:
                        u -= 1
                else:
                    curr = nums[l]
                    while l < u and nums[l] == curr:
                        l += 1
        return res
