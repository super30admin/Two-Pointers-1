# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def maxArea(self,height):
        if not height:
            return 0 
        low, high = 0 , len(height)-1
        max_ = float("-inf")
        while low < high:
            size = (high-low) * min(height[high],height[low])
            if size > max_:
                max_ = size 
            if height[low] < height[high]:
                low += 1 
            else:
                high -= 1 
        return max_

if __name__ == "__main__":
    s = Solution()
    height = [1,8,6,2,5,4,8,3,7]
    res = s.maxArea(height)
    print(res) 