'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(n)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Two pointers
        -> Loop until i < j (i can't be equal to j because then w = 0 and area = 0)
            -> width = j - i
            -> height = smaller of the two heights
            -> calculate the area and the max area
            -> move the pointer which had smaller height towards the other pointer
        -> return the max area
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        i = 0
        j = len(height) - 1

        while i < j:
            w = j - i

            if height[i] < height[j]:
                h = height[i]
                area = w * h
                max_area = max(area, max_area)
                i += 1
            else:
                h = height[j]
                area = w * h
                max_area = max(area, max_area)
                j -= 1

        return max_area
