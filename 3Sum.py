# Time Complexity : O(nlogn)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#First we sort the array, and fix a num at ith index and then take two pointers low and high
#Based on the sum of these 3num's we either increment or decrement ptrs. If sum<0, low++ else high++

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        curr_sum=0
        mainList = []
        for i in range(0,n-2):
            if i!=0 and nums[i]==nums[i-1]: #To take only unique no
                continue
            low = i+1
            high = n-1
            if nums[i]>0:
                break
            while low<high:
                curr_sum=nums[i]+nums[low]+nums[high]
                if curr_sum==0:
                    mainList.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while low<high and nums[low]==nums[low+1]:
                        low+=1
                    while low<high and nums[high]==nums[high-1]:
                        high-=1
                elif curr_sum<0:
                    low+=1
                else:
                    high-=1
        return mainList