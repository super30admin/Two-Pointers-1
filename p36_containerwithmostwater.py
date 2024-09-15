"""
https://leetcode.com/problems/container-with-most-water/

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
"""
"""brute force we calculate n square possibilities pairing each height with every othr height at index+1 and calculating the 
area based upon fact at the lower height will form the boundary O(n) solution
In two pointer approach we take the first pointer to the start of the array and the last pointer to the end of the array
we calculate the area and then we see whichever height is smaller among those two, since we will be shorterning our width window
we will proceed to the next node from that side where the height was less since we seek more height. 
Ran on leetcode-yes
TC: O(n)
Sc: O(1)
"""


# class Solution:
#     def maxArea(self, height: List[int]) -> int:
#         ##brute force
#         count = 0
#         maxarea = -float('inf')
#         for i in range(len(height)):
#             minheightsatisfied = float('inf')
#             for j in range(i + 1, len(height)):
#                 minheightSatisfied = min(height[i], height[j])
#                 # count+=1
#                 area = minheightSatisfied * (j - i)
#                 if area > maxarea:
#                     maxarea = area
#         return maxarea
#
#

class Solution:
    def maxArea(self, height):
        startPointer=0
        maxArea=-float('inf')
        endpointer=len(height)-1
        while startPointer<endpointer:
            area=(endpointer-startPointer)*min(height[startPointer],height[endpointer])
            maxArea=max(maxArea, area)
            if height[startPointer]<height[endpointer]:
                ##chance to improve height by moving the lower height to next value
                startPointer+=1
            elif height[startPointer]>height[endpointer]:
                endpointer-=1
            else:
                startPointer += 1
                endpointer -= 1
        return maxArea




height = [4, 3, 2, 1, 4]
solve=Solution()
print(solve.maxArea(height))