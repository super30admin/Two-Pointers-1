def maxArea(self, height: List[int]) -> int: #TC:O(n)  SC:O(1)
        n=len(height)
        i=0
        j=n-1
        max_water=0
        while i<j:
            length=min(height[i],height[j])
            breadth=j-i
            max_water=max(max_water,length*breadth)
            if height[i]<height[j]:
                i+=1
            else:
                j-=1
        return max_water
