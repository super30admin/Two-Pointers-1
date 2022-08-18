class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Two pointers TC - O(n), SC - O(1)
        n = len(height)
        start = 0
        end = n - 1
        output = 0
        while start < end:
            width = end - start
            output = max(output, width * min(height[start], height[end]))
            if height[start] <= height[end]:
                start += 1
            else:
                end -= 1

        return output

    '''
        # Brute Force TC -O(n**2), SC -O(1)
        output = 0
        for i in range(len(height)):
            for j in range(i+1,len(height)):
                water = (j-i)*(min(height[i],height[j]))
                output = max(output,water)
        return output
    '''
