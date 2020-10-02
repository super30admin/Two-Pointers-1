class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        l = 0
        r = len(height)-1 #8
        vol = -1
        print(height)
        while l<r:
            h = min(height[l],height[r]) #1
            vol = max((r-l)*h,vol)#8
            if (height[l]>height[r]):
                r-=1
            else:
                l+=1
        return vol
    #[1,8,6,2,5,4,8,3,7]