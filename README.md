# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
Approach:
start = 0, end = arr.length-1, moving = start+1
Here I have used three point approach. one pointer for 0(red), one for green(2) and one pointer and one moving pointer. The logic here is if we found 0 for moving pointer, we replace it with start and increment both pointers. If we found 2 at moving pointer we will replace it with end and decrement the end pointer. Here we will not increment the moving pointer because there might be the case that when replaced end with moving pointer we might get 0 for moving pointer so if we
incremented moving pointer, we might miss that 0.

## Problem2 (https://leetcode.com/problems/3sum/)
Approach:
Here the approach is similar to two sum. First I sorted the array. I kept one pointer at start, one pointer at end and one moving pointer. Checked the addition of these 3 pointers, if it is equal to 0, added in it set to avoid duplication. If sum>0 do end-- else start ++. At the end, return the list. 


## Problem3 (https://leetcode.com/problems/container-with-most-water/)
Approach:
Here I have used two pointer approach. One pointer at the end and one at the start. Calculate the area at every iteration using formula
min = Math.min(arr[start], arr[end])
maxWater = Math.max(maxWater, min*(end-start))
if my arr[start]>arr[end]
  end--
else
  start++
at some point, either end or start is going to be fixed on max on all numbers in array, then just we have to calculate the area.
return maxWater.
