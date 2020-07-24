# Leetcode 15. 3Sum

# Time Complexity :  O(n^2) where n is the size of the array

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Sorting the array can help in reducing the complexity from n^3 and dealing with duplicates.
# Once the array is sorted iterate through it with a low and a high pointer. If two subsequent numbers
# are equal continue the loop to next element. Calculate the total and if it equals zero append the array 
# of values to result. If its less than zero increment low as going towards low will only lower the total
# Similarly if the total is greater than high decrement high. If the total is zero and the preceeding
# neighbour and succeeding neighbour of high are same then increment low and decrement high to skip over 
# the duplicates. return the result array.

# Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        if len(nums) < 3:
            return result
        nums = sorted(nums)
        for i in range(len(nums)):
            if i>0 and nums[i-1] == nums[i]:
                continue

            low = i+1
            high = len(nums)-1
            
            while low < high:
                total = nums[i]+nums[low]+nums[high]
                if total == 0:
                    result.append([nums[i],nums[low],nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high] == nums[high+1]:
                        high -= 1
                elif total < 0:
                    low += 1
                else:
                    high -= 1
        return result
                
          