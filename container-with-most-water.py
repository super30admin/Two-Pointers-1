#Time Complexity - O(n)
#Space Complexity - O(1)
#Take two pointers, low and high
#Which ever height is minimum, go to the next low or high 
#keep calculating area everytime and take the maximum of it 
class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height) - 1
        area = 0
        
        while low < high:
            #calculate area and take max
            #min height is considered since we can only form an area which is the min of both
            area = max (area, ((high - low) * min(height[low], height[high])))
            #if height at low is less than height at high, go to the next low 
            if height[low] < height[high]:
                low += 1
            #if height at high is less than height at low, go to the next  high 
            #else condition also includes the equal condition, which does not matter, we can move high or low
            else:
                high -= 1
        return area