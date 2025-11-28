# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)

## Problem2 (https://leetcode.com/problems/3sum/)
* Brutforce - i, j, k
* 3sum = 1 num fix + 2sum(with left  & right pointer)
* record elements if sum = 0 when nums[i] + nums[l] + nums[r] = 0

## Problem3 (https://leetcode.com/problems/container-with-most-water/)
* Brutforce - i - 0->n-1 , j - i+1 -> n.
* Optimal - two pointers, area = Min(height[l], height[r]) * (r-l)
* move pointer whichever has lower height.

