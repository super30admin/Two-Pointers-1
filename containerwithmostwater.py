class Solution:
    def maxArea(self, height: List[int]) -> int:
        pref_array = []
        post_array = []
        if len(height)<1:
            return 0
        max_val = 0
        i=0
        j = len(height)-1
        while(i < j):
            max_val = max(max_val, (min(height[i],height[j])*(j-i)) )
            if height[i]>=height[j]:
                j-=1
            else:
                i+=1
        print(max_val)
        return max_val