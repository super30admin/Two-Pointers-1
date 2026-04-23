# https://leetcode.com/problems/3sum/description/
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        total_sum = 0
        n = len(nums)
        triplets = set()
        for i in range(n):
            my_set = set()
            remaining = total_sum - nums[i]
            for j in range(i + 1, n):
                if remaining - nums[j] in my_set:
                    temp = [nums[i], nums[j], remaining - nums[j]]
                    temp.sort()
                    triplets.add(tuple(temp))
                else:
                    my_set.add(nums[j])
        result = [list(x) for x in triplets]
        return result


nums = [-1,0,1,2,-1,-4]
sl = Solution()
print(sl.threeSum(nums))