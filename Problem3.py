#Time Complexity: O(n)
#Space complexity O(1)

#Accepted on Leetcode

#Approach:
#Put two pointers at start and end, for each 'start' and 'end' compute water quantity and compare with max (Change max if water > max)
#Whichever amongst height[start] and height[end] is lesser, increment/decrement that pointer at each step
#Keep repeating while start < end and return max at the end

class Solution:
    def maxArea(self, height: List[int]) -> int:
        A = height
        n = len(A)
        i = 0
        j = n-1
        maxHeight = 0
        while i < j:
            curHeight = (j - i)* min(A[i],A[j])
            maxHeight = max(curHeight, maxHeight)
            if A[i] < A[j]:
                i += 1
            else:
                j -= 1
        
        return maxHeight
