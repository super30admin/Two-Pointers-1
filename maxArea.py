#Tc:O(n)
#SC:O(1)
#Ran successfully on leetcode:yes

#Use two pointers left and right. 
# Assign their respective 0 and length-1 values to them ,
#Use a variable area , here update area value by checking for min values of the values pointed by pointers and their height.
# If the value of right pointer is higher, increment the left pointer else decrement the right pointer.


class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        area=0
        while l<r:
            area=max(area,min(height[l],height[r])*(r-l))
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return area
