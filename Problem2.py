"""
TC: O(N^2) {for every element we iterate the next array once, we ignore the sort NLOGN as N^2 is higher in order}
SC: O(1) {we dont use any extra space.}

Approach:

The threesum problem is just another two sum problem for each of the element. For each element, we calcualte the number required
to make the next two numbers' sum = 0. This is our target for the rest of the array for that element.
Now for each element, we use two pointers technique to find the triplet, once we find that we store that, and for similar numbers we skip
the two pointers from both the left and the right.

The problem ran successfully on Leetcode.
"""

from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # visited = set()
        res = []
        nums.sort() #nlogn

        for i in range(len(nums)):
            if nums[i] > 0:
                break

            if i>0 and nums[i] == nums[i-1]:
                continue

            l,r = i+1, len(nums)-1

            while l<r:
                curr = nums[i] + nums[l] + nums[r]
                if curr == 0:
                    #found a triplet
                    res.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while l < len(nums) and nums[l] == nums[l-1]: l+=1
                    while r>=0 and nums[r] == nums[r+1]: r-=1
                elif curr > 0:
                    r -= 1
                else:
                    l += 1

        return res