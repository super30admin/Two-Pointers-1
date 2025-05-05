#I've taken two pointers. Therefore the time compledxity would be O(len(height)-1) = O(n). Space complexity would be O(1) as we haven't used extra space.


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height or len(height)<2:
            return 0
        p1=0
        p2=len(height)-1
        mArea = 0
        while p1<=p2:
            mArea = max(mArea,((p2-p1)*min(height[p2],height[p1])))
            if height[p2]>=height[p1]:
                p1+=1
            else:
                p2-=1    

        return mArea
