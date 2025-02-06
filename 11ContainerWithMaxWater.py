def maxArea(height):
    left,right = 0, len(height)-1
    max_water = 0

    while left < right:
        #Calculate the current area
        current_area = (right-left)*min(height(left),height(right))
        max_water = max(max_water, current_area)

        #move the pointer with smaller height 
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    
    return max_water


