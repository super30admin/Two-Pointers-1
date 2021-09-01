# Time Complexity : O(N^2) for the while loop
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I forgot to sort the array

class Solution:
    def threeSum(self,nums):

        if len(nums) == 0 or len(nums) < 3:
            return []
        res = []
        nums.sort()
        for i in range(len(nums)):

            if i > 0 and nums[i] == nums[i-1]:
                continue
            lo, hi = i+1, len(nums) - 1
            while lo < hi:

                mysum = nums[i] + nums[lo] + nums[hi]
                if mysum == 0:
                    temp = [nums[i], nums[lo], nums[hi]]
                    res.append(temp)
                    lo += 1
                    hi -= 1
                    while lo < hi and nums[lo] == nums[lo - 1]:
                        lo += 1
                    while lo < hi and nums[hi] == nums[hi+1]:
                        hi -= 1
                
                elif mysum < 0:
                    lo += 1
                else:
                    hi -= 1
        return res

nums = [-1,0,1,2,-1,-4]
obj = Solution()
print(obj.threeSum(nums))