"""
TC: O(N) {we iterate the nums array only once}
SC: O(1) {we dont use any extra spaces}

Approach:

We initialize three pointers with two at the start and one at the end. The goal is to store the 3 diff colors in their corresponding, sorted
positions.
Since there are only 3 colors, 0,1,2, we first check if the num at mid is 0, if it is then we swap the num at mid with num at low,
so as to move the 0 to the start and increment the ptr of low and mid by 1.
Similarly, if the num at mid is 1, we dont do anything as its already at its sorted position, just increment mid by 1.
And finally if the num at mid is 2, we move that number to end by swapping the end with mid and decrease the end pointer.

The problem ran successfully on Leetcode.
"""
from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        red, white, blue = 0, 0, len(nums) - 1

        while white <= blue:
            if nums[white] == 0:
                nums[red], nums[white] = nums[white], nums[red]
                red += 1
                white += 1
            elif nums[white] == 1:
                white += 1
            else:
                nums[white], nums[blue] = nums[blue], nums[white]
                blue -= 1
