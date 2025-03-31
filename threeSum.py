"""
Approach: 
Here we are 3 pointers approach to find the elements whose sum is equal to 3
For each index of i, we selecy nums[i] and use 2 pointers one from start and other from the end.
if the sum of these 3 equal to zero, we add these values to the result.
if the sum is higher than 0, thenwe shift the right pointer towards left
if the sum is < 0 we shift the left pointer to right. we iterate the array till len(num) -2 and start crosses end.

other than that we should ensure that, there are no duplicates. 
so ate at all stages of accessing i, start and end we check whether the current element and previous are same or not. if same we pointer accordingly

Time Complexity: O(n2)

Space Complexity: O(1)

Passed in Leetcode: Yes

Any difficulties: No

"""
from typing import List
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:    
        nums.sort()
        result = []
        n = len(nums)
        for i in range(n-2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue 
            if nums[i] > 0:
                break
            start = i + 1
            end = n-1
            while(start < end):
                total = nums[i] + nums[start] + nums[end] 
                if (total == 0):
                    result.append([nums[i], nums[start], nums[end]])
                    # Skip duplicates
                    while start < end and nums[start] == nums[start + 1]:
                        start += 1
                    while start < end and nums[end] == nums[end - 1]:
                        end -= 1
                    start += 1
                    end -= 1
                elif (total > 0):
                    end -= 1
                else:
                    start += 1
        return result


sol = Solution()
nums = [-1,0,1,2,-1,-4]
print(sol.threeSum(nums))