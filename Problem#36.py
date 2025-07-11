'''
11. Container With Most Water
'''

# Time Complexity : O(n) because we are using two pointers to traverse the array.
# Space Complexity : O(1) because we are using a constant amount of space.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes, replacing the brute force approach to a two moving pointers approach took some time. When two pointers are used, they move towards each other, and the area is calculated based on the minimum height of the two pointers.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Brute Force Approach
        '''
        Time Complexity : O(n^2) because we are using two nested loops to calculate the area.
        Space Complexity : O(1) because we are using a constant amount of space.
        Intuition:
        - We will use two pointers, one at the beginning and one at the end of the array.
        - We will calculate the area between the two pointers and move the pointer with the smaller height towards the other pointer.
        - We keep updating the maximum area found so far.
        '''
        # n = len(height) # humne height array ki length n se store kar li hai(we store the length of the height array in n)
        # max_area = 0 # humne max_area ko 0 se initialize kiya hai(we initialize max_area to 0)
        # for i in range(n): # hum i ko 0 se n tak iterate karte hain(we iterate i from 0 to n)
        #     for j in range(i + 1, n): # hum j ko i + 1 se n tak iterate karte hain(we iterate j from i + 1 to n)
        #         # Calculate the area between the two pointers
        #         area = min(height[i], height[j]) * (j - i) # hum area ko calculate karte hain(min(height[i], height[j]) * (j - i))(we calculate the area as min(height[i], height[j]) * (j - i))
        #         max_area = max(max_area, area) # hum max_area ko update karte hain(max(max_area, area))(we update max_area as max(max_area, area))
        # return max_area # hum max_area ko return karte hain(we return max_area)

        # Two Pointers Approach
        '''
        Time Complexity : O(n) because we are using two pointers to traverse the array.
        Space Complexity : O(1) because we are using a constant amount of space.
        Intuition:
        - We will use two pointers, one at the beginning and one at the end of the array.
        - We will calculate the area between the two pointers and move the pointer with the smaller height towards the other pointer.
        - We keep updating the maximum area found so far.
        '''
        left, right = 0, len(height) - 1 # humne left pointer ko 0 se initialize kiya hai aur right pointer ko height array ki last index se initialize kiya hai(we initialize the left pointer to 0 and the right pointer to the last index of the height array)
        max_area = 0 # humne max_area ko 0 se initialize kiya hai(we initialize max_area to 0)
        while left < right: # jab tak left pointer right pointer se chhota hai tab tak loop chalega(while the left pointer is less than the right pointer)
            # Calculate the area between the two pointers
            area = min(height[left], height[right]) * (right - left) # hum area ko calculate karte hain(min(height[left], height[right]) * (right - left))(we calculate the area as min(height[left], height[right]) * (right - left))
            max_area = max(max_area, area) # hum max_area ko update karte hain(max(max_area, area))(we update max_area as max(max_area, area))
            # Move the pointer with the smaller height towards the other pointer
            if height[left] < height[right]: # agar left pointer ka height right pointer se chhota hai toh hum left pointer ko 1 se badhate hain(If the height at the left pointer is less than the height at the right pointer, we increment the left pointer by 1)
                left += 1 # hum left pointer ko 1 se badhate hain(we increment the left pointer by 1)
            else: # agar right pointer ka height left pointer se chhota hai ya barabar hai toh hum right pointer ko 1 se kam karte hain(If the height at the right pointer is less than or equal to the height at the left pointer, we decrement the right pointer by 1)
                right -= 1 # hum right pointer ko 1 se kam karte hain(we decrement the right pointer by 1)
        return max_area # hum max_area ko return karte hain(we return max_area)