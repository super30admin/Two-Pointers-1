# Did it run successfully on LC? YES

class Solution:
    def maxArea(self, height):
        p1 = 0  # first (left) pointer
        p2 = len(height) - 1  # second (right) pointer
        max_area = 0
        while p1 != p2:
            if height[p1] > height[p2]:
                area = height[p2] * (p2 - p1)  # height of smaller edge multiplies on length
                p2 -= 1  # changing smaller edge
            else:
                area = height[p1] * (p2 - p1)
                p1 += 1
            if area > max_area: max_area = area  # increasing max area if possible
        return max_area

if __name__ == "__main__":
    s = Solution()
    height = [1,8,6,2,5,4,8,3,7]
    print(s.maxArea(height))
        