class Solution:
    def maxArea(self, height: List[int]) -> int:
        f=area=0
        r=len(height)-1
        while(f<r):
            print(f,r)
            # checking if the stored area is bigger with current indexes or not
            area = max(area,min(height[f],height[r])*(r-f))
            if height[f] < height[r]:
                f +=1
            else:
                r -=1
        return area
        
        
    """
    TC- O(n)
    SC- O(1)
    Did this code successfully run on Leetcode- Yes :
    Any problem you faced while coding this- No :
    """
        