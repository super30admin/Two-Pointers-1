#All TC on leetcode passed

class Solution:
    #Here we use 2 pointers technique. We place left pointer at leftmost of 
    #array and right ponter on rightmost of the array. 
    #Now we compute area b/w the pointers. Based on which pointer 
    #has lower height we move the pointers
    #Time complexity: O(n)
    #Space complexity: O(1)
    def maxArea(self, height: List[int]) -> int:
        l = 0
        h = len(height)-1

        maxArea = 0

        while l<h:
            area = min(height[h], height[l])*(h-l)
            maxArea = max(maxArea, area)

            if height[l]<height[h]:
                l += 1
            else:
                h -= 1

        return maxArea
        