class Solution:
    def maxArea(self, height: List[int]) -> int:
        '''Approach: Two Pointer
        Start with two pointers at extreme ends
        Since area is limited by shorter height, move the pointer pointing to shorter height
        Update the area if we found a better set of heights
        '''
        start, end = 0, len(height)-1
        area = 0
        while start < end:
            s_height, e_height = height[start], height[end]
            area = max((end-start) * min(s_height, e_height), area)
            if s_height < e_height:
                start += 1
            else:
                end -= 1
        return area
    
    '''Complexity Analysis:
    Time Complexity: O(N) --> Single Pass
    Space Complexity: O(1) --> Constant Space occupied by pointers
    '''
        