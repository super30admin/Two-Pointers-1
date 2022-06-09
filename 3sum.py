# time: O(nlogn) Space: 0(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        res = []
        nums.sort()
        for i, val in enumerate(nums):
            if i >= 1 and val == nums[i - 1]:  # 3,3,4,5 here 3, 3 are same so we will countinue to 4
                continue

            l = i + 1
            r = len(nums) - 1

            while l < r:
                threeSum = val + nums[l] + nums[r]
                if threeSum > 0:
                    r -= 1
                elif threeSum < 0:
                    l += 1
                else:
                    res.append([val, nums[l], nums[r]])
                    # -2,-2,0,2,2
                    l += 1
                    while nums[l] == nums[l - 1] and l < r:
                        l += 1

        return res



