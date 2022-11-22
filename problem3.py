#time complexity: O(n)
#space complexity: O(1)
#ran on leetcode: yes
#use two pointers from start and end to iterate through the list. 
#calculate the area between i and j. Check if this is the biggest area seen so far.
#Now move i and j pointer depending on whether height[i] or height[j] is maximum.
class Solution:
    def maxArea(self, height) -> int:
        i=0
        j=len(height)-1
        best=0
        while(i<j):
            curr=min(height[i],height[j])*(j-i)
            best=max(best,curr)
            if(height[i]<height[j]):
                i+=1
            else:
                j-=1
        return best


s=Solution()
height = [1,8,6,2,5,4,8,3,7]
print(s.maxArea(height))