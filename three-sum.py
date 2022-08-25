# Time Complexity :O(N*N) 2 sum and a for loop 
# Space Complexity :O(1) no extra space used
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        if nums==None or len(nums)==0:
            return
        tsum=0
        result = set()
        nums.sort()
        for i in range(0, n-2):
            if i!=0 and nums[i]==nums[i-1]:
                continue
            low=i+1
            high=n-1
            target=0-nums[i]
            while low<high:
                if nums[low] + nums[high] + nums[i] ==0:
                    result.add((nums[i], nums[low], nums[high]))
                    low += 1
                    high -= 1
                elif nums[low] + nums[high] <target:
                    low += 1
                else:
                    high -= 1
        return result