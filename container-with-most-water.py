# Intuition:
# Area = w * h where width = diff between indices
# we either do brute force. Basically iterate through each element and make n-1 comparisons to find area. Keep track of maximum area.
# TC: O(n^2)

# better way - 2 pointers (left and right) at both ends of the array:
# if height[left] < height[right], that means the max area could be height[left and the rightmost idx since width would be mx here. So we won't find a max greater than this. hence increase left ptr.
# if for any left, right ptr you get height [right] < height[left], then it means height[right] is the maximum area you can get between height(left,right).
# Inshort, whichever side (left or right) is shorter in length, that is the maximum area you can get with those indices. Hence increase the ptr of that side

# TC: O(n)
# SC: O(1) no extra space

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """

        n = len(height)
        left = 0
        right = n-1
        maxV = float('-inf')
        start = end = 0

        while left <= right and right != 0 and left != n:
            temp_height = min(height[right], height[left])
            width = right - left
            area = width * temp_height

            # if current area is greater than the value at maxV then store the indices of left and right as this is changing my max, this is the exact index where I am getting maximum area in the given array of height
            if maxV < area:
                start = left
                end = right
                maxV = max(maxV, area)

            # print(left, right, maxV)
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
        print(start, end)
        return maxV


obj = Solution()
res = obj.maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7])
print(res)
