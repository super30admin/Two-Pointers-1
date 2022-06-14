class Solution:
    def maxArea(self, height) -> int:
        if height is None or len(height) == 0:
            return 0

        m = 0
        low, high = 0, len(height) - 1
        # print(high)
        while low < high:
            # print(high)
            m = max(m, min(height[low], height[high]) * (high - low))
            if height[low] <= height[high]:
                low += 1
            else:
                high -= 1
        return m


if __name__ == '__main__':
    obj = Solution()
    print(obj.maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]))

# TC = O(n)
# Space complexity : O(1). Constant
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : got list out if index error as I was incrementing high instead of decrementing it.
