'''
Time Complexity: O(n)
Space Complexity: O(1)
Approach: Iterate using two pointers,
Increase pointer i if nums[i <nums[j] 
elif nums[j] is smaller, decrease j-=1
else: when nums[i]==nums[j]:
decrease both i and j
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea=0
        i=0
        j=len(height)-1
        while i<j:
            area=abs(j-i)*min(height[i],height[j])
            maxArea=max(area,maxArea)
            if height[i]<height[j]:
                i+=1
            elif height[i]>height[j]:
                j-=1
            else:
                i+=1
                j-=1
        return maxArea
        