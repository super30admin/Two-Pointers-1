class Solution:
    def maxArea(self, height: List[int]) -> int:
        ptr1, ptr2 =0,len(height)-1
        max_area = 0
        
        while ptr1!=ptr2: 
            max_area = max(max_area,(ptr2-ptr1)*min(height[ptr1],height[ptr2]))#max area depends on min height and space between pointers
            #move pointer with less height to decrease lenght between pointers
            if height[ptr1] >height[ptr2]: 
                ptr2-=1
            else:
                ptr1+=1
            
        return max_area

#Time complexity O(n) #one pass
#Space complexity O(1) in place, 2 pointers, max area variables
