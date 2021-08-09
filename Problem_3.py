class Solution:
    """
    Exhaustive approach
    TC - O(n^2)
    SC - O(1)
    """

    def approach1(self, h):
        maxx = 0
        for i in range(len(h)):
            for j in range(i + 1, len(h)):
                maxx = max(maxx, min(h[i], h[j]) * (j - i))
        return maxx

    """
    Two pointer approach 
    TC - O(n)
    SC - O(1)
    """

    def approach2(self, h):
        maxx, left, right = 0, 0, len(h) - 1
        while (left < right):
            maxx = max(maxx, min(h[left], h[right]) * (right - left))
            if h[left] < h[right]:
                left += 1
            else:
                right -= 1
        return maxx

    def maxArea(self, height: List[int]) -> int:
        if height is None or not height:
            return 0
        return self.approach2(height)