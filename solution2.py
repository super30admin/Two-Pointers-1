# time: O(n^2)
# space: O(n)
class Solution(object):
    def threeSum(self, nums):
        nums.sort()
        # print(nums)
        res = []
        i = 0
        while i < len(nums):
            uniSet = set()
            target = -1 * (nums[i])
            for j in range(i + 1, len(nums)):
                if target - nums[j] in uniSet:
                    if [nums[i],  target - nums[j], nums[j]] not in res:
                        res.append([nums[i],  target - nums[j], nums[j]])
                uniSet.add(nums[j])
            i += 1
        return res