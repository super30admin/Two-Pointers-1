## Problem3 (https://leetcode.com/problems/container-with-most-water/)

# Method-1: Nested loops: Brute force
# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : TLE
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Run nested iterations to calculate area between all possible spokes and return the max area


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxArea = 0
        left = 0
        right = len(height) - 1
        # in case left == right, area would be 0
        # so our condition is left < right
        for i in range(len(height)):
            for j in range(i + 1, len(height)):
                # area = min(left height, right height) * width
                currArea = (min(height[i], height[j])) * (j - i)
                maxArea = max(maxArea, currArea)



        return maxArea
    
sol = Solution()
print("Method1: Nested loops: Brute force")
print(sol.maxArea([1,8,6,2,5,4,8,3,7]))
print(sol.maxArea([1,1]))
print(sol.maxArea([0,1]))
print(sol.maxArea([1,0]))
print(sol.maxArea([1,22,6,2,5,4,8,100,100]))


# Method-2: Two pointers
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# We have used two pointer approach to eliminate nested iterations here. We keep one pointer at start and another at the end index.
# Then we calculate the area. If we see our width is max and would always decrease as we move our pointers forward. The effective
# height is dominated by the smaller pointer height. Only possibility of increased area would be incrementing the height. So we have to 
# move the pointer that is giving us the smaller height. Also if we see, for the smaller height pointer current area would be the max
# possible area with it, as width would decrease ahead. So we move the pointer that is currently giving us the min height.

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxArea = 0
        left = 0
        right = len(height) - 1
        # in case left == right, area would be 0
        # so our condition is left < right
        while(left < right):
            # area = min(left height, right height) * width
            currArea = (min(height[left], height[right])) * (right - left)
            maxArea = max(maxArea, currArea)

            # change pointers based on heights
            if(height[left] < height[right]):
                # we cannot have any better area for left pointer height
                # increment left
                left += 1
            elif(height[right] < height[left]):
                # we cannot have any better area for right pointer height
                # decrement right
                right -= 1
            else:
                # if both height are equal
                # we cannot have a better area for both
                left += 1
                right -= 1

        return maxArea
    
sol = Solution()
print("Method12: Two pointers")
print(sol.maxArea([1,8,6,2,5,4,8,3,7]))
print(sol.maxArea([1,1]))
print(sol.maxArea([0,1]))
print(sol.maxArea([1,0]))
print(sol.maxArea([1,22,6,2,5,4,8,100,100]))

