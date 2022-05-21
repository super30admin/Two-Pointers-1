#Time Complexity: O(n)
#Space Complexity: O(1)
#did your code run on leetcode : yes

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maximum = 0
        
        left = 0 
        right = len(height) - 1
        
        start = 0
        end = 0
        
        while(left <= right):
            current_max = min(height[left],height[right]) * (right - left)
            
            if current_max > maximum:
                start = left
                end = right
                maximum = current_max
        
            if (height[left] < height[right]):
                left += 1
            else:
                right -= 1
        
        print("start index of container:",start)
        print("end index of container:",end)
                
        return maximum
            
