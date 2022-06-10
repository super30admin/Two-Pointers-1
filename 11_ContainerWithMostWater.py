"""
Leetcode - https://leetcode.com/problems/container-with-most-water/
TC- O(N) - only one iteration, SC - O(1)
Lecture - https://youtu.be/Zk6c23jE6Dg
Challenge -
FAQ-
Other techniques? Brute force - finding all possible two pair and comparing area


You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the
ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

Constraints:
n == height.length
2 <= n <= 10^5
0 <= height[i] <= 10^4
"""

'''
Ideation - two pointer
Let's build our understanding of the problem first. 
Suppose our pair is [i,j], the water you can hold between them will be area = min(height[i], height[j]) * (j - i) width

Now let's think from a two pointer approach, we have to make decision of which of those pointers to move and either
side we move, we are shrinking the area by 1, wo only decision factor we have is height. Now that we are convinced with
this idea, our decision gets easier, we want to move away from the smaller height. Don't worry about moving the pointer
even if you think your pair could be the largest area, we will be taking max(previous max, new area).
'''


class Solution:
    def maxArea(self, height):
        low = 0
        high = len(height) - 1
        maxArea = 0
        while low < high:
            currArea = min(height[low], height[high]) * (high - low)
            maxArea = max(maxArea, currArea)
            # move the pointer with shorter height
            if height[high] > height[low]:
                low += 1
            else:
                high -= 1

        return maxArea
