# TC: O(n)
# SC: O(1)

def maxArea(height):
        left = 0
        right = len(height) -1 
        max_vol = 0

        while left < right:
            max_height = 0
            width = right - left
            if height[right] < height[left]:
                max_height = height[right]
                right -=1
            else:
                max_height = height[left]
                left += 1

            max_vol = max(max_vol, max_height*width)    
        
        return max_vol

height = [1,8,6,2,5,4,8,3,7]
print(maxArea(height))