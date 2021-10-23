# 15. 3Sum
# https://leetcode.com/problems/3sum/

# Using 2Sum

# Time complexiety: O(n*n)
# Space complexiety: O(n)
class Solution1:
    def twoSum(self, nums, tar):
        temp_set = set()

        for item in nums:
            if tar - item in temp_set:
                return (item, tar-item)
            else:
                temp_set.add(item)

    
    def threeSum(self, nums):
        res = []

        for idx,i in enumerate(nums):
            new_nums = nums[:idx]+nums[idx+1:]
            if self.twoSum(new_nums,-i):
                l,r = self.twoSum(new_nums,-i)
                res_2sum = sorted([i,l,r])
                if res_2sum not in res:
                    res.append(res_2sum)
        return res


obj = Solution1()
# print(obj.threeSum([-1,0,1,2,-1,-4,-2,-3,3,0,4]))

# Using 2 Pointers
# Time complexiety: O(n*nlogn)
# Space complexiety: O(n)
class Solution2:
    def threeSum(self, nums):
        if len(nums) < 3:
            return []

        res = []

        for idx, item in enumerate(nums):
            new_nums = sorted(nums[:idx]+nums[idx+1:])
            l = 0
            r = len(new_nums) - 1
            while l < r:
                if new_nums[l] + new_nums[r] == -item:
                    res_2sum = sorted([item,new_nums[l],new_nums[r]])
                    if res_2sum not in res:
                        res.append(res_2sum)
                    l += 1
                    r -= 1
                elif new_nums[l] + new_nums[r] < -item:
                    l += 1
                else:
                    r -= 1
        return res

obj = Solution2()
# print(obj.threeSum([-1,0,1,2,-1,-4]))
print(obj.threeSum([-1,0,1,2,-1,-4,-2,-3,3,0,4]))