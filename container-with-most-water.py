# Take two pointers l=0 r=n-1. initialize max volume with 0
# while l<r loop through the array take the diffrence between the indices and 
# multiply it to the shorteer height. Compare the vol with the previous max vol,
#  if the current vol is greater, assign this val to max vol


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        n=len(height)
        r=n-1
        l=0
        mvol=0

        while l<r:
            v=(r-l)*min(height[l],height[r])
            # print(v)
            mvol=max(mvol,v)
            if height[l]>height[r]:
                r-=1
            else:
                l+=1
        return mvol
            



        
            
            





        