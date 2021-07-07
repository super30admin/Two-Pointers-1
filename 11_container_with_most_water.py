from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        """
                https://leetcode.com/problems/container-with-most-water/
                // Time Complexity : O(n)
                        'n' is the number of vertical lines
                // Space Complexity : O(1)
                // Did this code successfully run on Leetcode : Yes
                // Any problem you faced while coding this : No
                // Three line explanation of solution in plain english:
                     Intuition behind moving the smallest of low and high pointer:
                     - The widest container is a good candidate, because of its width.
                       Its water level is the height of the smaller one of low and high pointer.
                     - All other containers between the low and high pointer are less wide and
                       thus would need a higher water level (height) in order to hold more water.
                     - Hence, the smaller one of low and high pointer doesn't support a higher water level
                       and can thus be safely removed from further consideration.
                     - The minimum height at each pointer is the constraint. We cannot have water more
                       than that because moving forward the width is decreasing. The only way to increase
                       water level is to increase the height. MOVE AWAY FROM THE CONSTRAINT !
        """
        if not height:
            return 0

        cur_max = 0
        low, high = 0, len(height) - 1

        while low < high:
            cur_max = max(cur_max, (high - low) * min(height[low], height[high]))
            # the contraint is at height[low]
            if height[low] < height[high]:
                low += 1
            # the constraint is at height[high]
            elif height[high] < height[low]:
                high -= 1
            # the constraint is at both height[low] and height[high]
            else:
                low += 1
                high -= 1
        return cur_max

    def max_area_brute_force(self, height: List[int]) -> int:
        """
            // Time Complexity : O(n^2)
                    'n' is the number of vertical lines
            // Space Complexity : O(1)
        """
        cur_max = 0
        for i in range(len(height)):
            for j in range(i + 1, len(height)):
                cur_max = max(cur_max, (j - i) * min(height[i], height[j]))
        return cur_max


if __name__ == '__main__':
    h = Solution()
    print(h.maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]))
    print(h.max_area_brute_force([1, 8, 6, 2, 5, 4, 8, 3, 7]))
