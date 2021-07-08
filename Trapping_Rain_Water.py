#Using two pointers to find the max water
#Space:O(1)
#time:O(n)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        pref_array = []
        post_array = []
        if len(height)<1:
            return 0
        pref_array = [height[0]]
        post_array = [height[-1]]
        for i in range(1,len(height)):
            pref_array.append(max(height[i],pref_array[-1]))
        for i in range(len(height)-2, -1, -1):
            post_array.append(max(height[i],post_array[-1]))
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