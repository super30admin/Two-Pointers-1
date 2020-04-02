//time complexity: O(n^2)
//space complexity: O(1)

class MaxAreaSolution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int len = height.length;           
        if (len < 2)
        {
            return 0;
        }
        for (int i = 0; i < len - 1; i++)
        {
            for (int j = len - 1; j > 0; j--)
            {
                {
                   int area = (height[i] == height[j] ? height [i] * (j-i) : (height[i] > height [j]) ? height[j] * (j-i) : height[i] * (j-i));
                    
                    if(area > maxArea)
                    {
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;
        
    }
}