# Time Complexity : O(n^2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0:
                break;
            if i==0 or nums[i] != nums[i-1]:
                self.twosum(nums, i, res)
        return res
    
    def twosum(self, nums: List[int], i: int, res: List[List[int]]):
        lo, hi = i+1, len(nums)-1
        while(lo < hi):
            sum = nums[i] + nums[lo] + nums[hi]
            if sum < 0 or (lo > i+1 and nums[lo] == nums[lo-1]):
                lo += 1
            elif sum > 0 or (hi < len(nums)-1 and nums[hi] == nums[hi+1]):
                hi -= 1
            else:
                res.append([nums[i], nums[lo], nums[hi]])
                lo+=1
                hi-=1
