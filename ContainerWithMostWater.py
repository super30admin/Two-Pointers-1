class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        
        # Brute force will be to run two loops and check everytime the area
        # Brute force will have a time complexity of O(n^2)
        # Space here will be O(1)
        
        # Taking the two pointer Approach
        left = 0
        right = len(height) - 1
        max_area = 0
        
        # Iterate till left is less than right
        while left < right:
            if height[left] > height[right]: # If the height on the left pointer is greater then take the area with height of the right pointer because a container can't be formed if the other pointer height is smaller  so we go with the smaller pointer
                max_area = max(height[right] * (right - left), max_area)
                right -= 1 #Increment the one which is smaller pointer. In this case it is the right pointer
            else:
                max_area = max(height[left] * (right - left), max_area)
                left += 1
        
        return max_area
    
    # Time Complexity: O(n) where n is the size of height array
    # Space Complexity: O(1) because we haven't used any extra space
    
                
            
            