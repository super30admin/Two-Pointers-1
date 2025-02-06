#  https://leetcode.com/problems/container-with-most-water/

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
# take 2 pointers on either side take the min of the value in that index and then multiply it with the diff in the index
#  then move the left or right pointers by comparing the height in those indices 
# minimum will move 


class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        l = 0
        r = n-1
        ans = 0
        while(l<r):
            area = min(height[l], height[r]) * (r-l)
            ans = max(ans,area)
            if(height[l] <= height[r]):
                l+=1
            else:
                r-=1
        return ans
        