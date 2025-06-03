# Time O(n)
# Space O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l,r = 0, len(height)-1
        maxVolume = 0
        while l < r:
            v = min(height[l], height[r]) * (r-l)
            if v > maxVolume:
                maxVolume = v
                # print(f"maxVolume={v}, l={l}, r={r} = ({height[l]},{height[r]})")
            if height[l] < height[r]:
                l+=1
            else:
                r-=1
        
        return maxVolume
