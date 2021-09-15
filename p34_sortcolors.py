"""
https://leetcode.com/problems/sort-colors/
count, sort
Approach: the idea is to have a low pointer pointing to all the 0's the,high pointer with al the twos and middle pointer with all the one's
Tc-O(n)
sc-O(1)
Leecode-yes
"""

class Solution:
    def sortColors(self, nums):
        low = 0
        high = len(nums) - 1
        middle = 0
        ###check possibility of 0's and 2's extreme values at every scenario
        while middle<=high:
           if nums[middle]==2:
               nums[middle], nums[high] = nums[high], nums[middle]
               high-=1
                ###we want to place two's at the end so we swap it with the high numbe
           elif nums[middle]==0:
               nums[low], nums[middle]=nums[middle], nums[low]
               low+=1
               middle+=1

               # low and mid can be at the same place
           else:
              middle += 1
              ##elif nums[middle]==1

        return nums


nums = [2,0,2,1,1,0]
solve=Solution()
print(solve.sortColors(nums))


