##### Containers with most waters ######

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Keep two pointers and accordingly move the pointer with the lesser value to maximise the volume and keep computing the max volume

def container_with_most_water(heights):
    if not heights:
        return 0
    
    l = 0
    r = len(heights)-1
    max_volume = 0
    while l < r:
        volume = min(heights[l],heights[r]) * (r-l)
        max_volume = max(max_volume, volume)
        if heights[l] < heights[r]:
            l+=1
        else:
            r-=1
    return max_volume
        
