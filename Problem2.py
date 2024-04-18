## Problem2 (https://leetcode.com/problems/3sum/)

#Approach
# Sort the nums list. traverse from the first element and as we are finding triplet, traverse till 3rd last element
# set low = i+1 and high = len(nums)-1. While low<high, check if value of i,low&high == 0. if yes, add it to hset and low += 1 & high -= 1
# if sum < 0, increment low else decrement high. To handle duplicate issue write a while loop that will move low and high pointer till the value does not change. Return hset 

# Time Complexity: O(n2)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        hset = set()
        print(nums)
        for i in range(len(nums)-2):
            
            low = i+1
            high = len(nums)-1
            if nums[i]>0:
                break
            
            while(low<high):
                if (nums[i]+nums[low]+nums[high] == 0):
                    hset.add((nums[i],nums[low],nums[high]))
                    low += 1
                    high -= 1
                 
                    while (low <high and nums[low] == nums[low-1]):
                        low += 1
                    while (low<high and nums[high] == nums[high+1]):
                        high -= 1
                elif (nums[i]+nums[low]+nums[high] < 0):
                    low += 1
                else:
                    high -= 1

        return hset