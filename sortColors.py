'''
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
3 pointer approach
        initialize p0 at left index, that's boundary for 0s
        initialize p2 at rightmost index, that's boundary for 2s
        everytime we find 0 at curr idx - swap it with p0
        everytime we find 2 at curr idx - swap it with p2
        if curr passes p2 then we stop
        single pass TC: O(n), SC O(1)
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p0, p2 = 0, len(nums) -1
        curr = 0
        while curr <= p2:
            if nums[curr] == 0:
                nums[curr], nums[p0] = nums[p0], nums[curr]
                # we can safely move curr forward as we have seen both nums[curr] and nums[p0] as we were moving left to right
               # print(nums[p0], nums[curr]) # always print 0 ,0 or 0, 1
                p0 += 1
                curr += 1
            elif nums[curr] == 2:
                nums[curr], nums[p2] = nums[p2], nums[curr]
                # we don't know what is new nums[curr], so let's not move that forward, only reduce p2
                # as we know now what is nums[p2] and it is correct
                #print(nums[p2]) # always be 2
                p2 -= 1
            else:
                curr += 1
        # 2 pointer approach
        # works in simple cases , fails on edge cases and more complex as multiple passes order of O(2n) or more
#         if len(nums) == 1 or len(nums) == 0:
#             return
#         if len(nums) == 2:
#             if nums[0] > nums[1]:
#                 nums[0], nums[1] = nums[1], nums[0]
#             return
#         if len(nums) == 3:
#             if nums[0] < nums[1] < nums[2]:
#                 return
#         for i in range(2):
#             if i == 0:
#                 l, h = 0, len(nums) -1
#             else:
#                 l, h = 0, len(nums) -1
#                 while l<h and nums[l] != i:
#                     l +=1
#                 l -= 1
#             while  l < h:
#                 if nums[h] == i and nums[l] != i:
#                     nums[l], nums[h] = nums[h], nums[l]
#                     l+=1
#                     h-=1
#                 if nums[l] == i:
#                     l += 1
#                 if nums[h] != i:
#                     h -= 1
                
    