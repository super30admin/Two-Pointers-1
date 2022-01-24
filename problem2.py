#Time Complexity = O(n)
#Space Complexity = O(1)

def maxArea(self, height: List[int]) -> int:
        l =0 
        r = len(height)-1
        ans = 0
        while(r>l):
            if(height[l]>height[r]):
                area = height[r]*(r-l)
                r-=1
            else:
                area = height[l]*(r-l)
                l+=1
            ans = max(ans,area)
        return ans