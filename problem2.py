#3-sum
#time complexity: O(n^2)
#spacecomplexity : O(n)

class Solution:
    def threeSum(self, nums):
        nums.sort()
        n, result = len(nums), []

        for i in range(n):
            if i > 0 and nums[i] == nums[i-1]: continue

            target = -nums[i]
            beg, end = i + 1, n - 1 #beg =>low and end=>high
#performing 2 sum apporach here 
            while beg < end:
                if nums[beg] + nums[end] < target:
                    beg += 1
                elif nums[beg] + nums[end] > target:
                    end -= 1
                else:
                    if len(result) == 0 or result[-1] != (nums[i], nums[beg], nums[end]):
                        result.append((nums[i], nums[beg], nums[end]))
                    beg += 1
                    end -= 1

        return result
        