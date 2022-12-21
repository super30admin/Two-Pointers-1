#Time Complexity: O(n^2)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        res = []
        if n==0:
            return []
        for i in range(n):
            if nums[i]>0:
                break
            if i>0 and nums[i]==nums[i-1]:
                continue
            low = i+1
            high = n-1
            while low<high:
                total = nums[i]+nums[low]+nums[high]
                if total == 0:
                    res.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while low<high and nums[low]==nums[low-1]:
                        low+=1
                    while low<high and nums[high]==nums[high+1]:
                        high-=1
                elif total<0:
                    low+=1
                else:
                    high-=1
        return res