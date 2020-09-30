# Time Complexity: O(nlogn)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

def threeSum(self, nums):
        n = len(nums)
        ans = []
        nums.sort()
        for i in range(n-2):
            if i>0 and nums[i]==nums[i-1]:
                continue # if condtion is true then next i will be called and this will not be counted
            l = i+1
            r = n-1
            while l<r:
                add = nums[l]+nums[r]+nums[i]
                if add==0:
                    ans.append([nums[l],nums[r],nums[i]])
                    while l<r and nums[l]==nums[l+1]:
                        l += 1
                    while l<r and nums[r]==nums[r-1]:
                        r -= 1
                    l += 1
                    r -= 1
                elif add>0:
                    r -= 1
                else:
                    l += 1     
                       
        return ans