class Solution {
    // Brute force Approch 
// Time Complexity: O(n^2) where n is number of elements in height area
// Space Complexity: O(1) 
    public int maxArea(int[] height) {

// If height array is null or empty return 0
        if(height==null || height.length==0)
        {
            return 0;
        }

// maximum area achieved 
        int maxArea = 0;
        // length of height array
        int n = height.length;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                // Width is length between i & j
                // Height is the minimum amongst the height[i] or height[j] as 
                // we have to create a container so we will pick the minimum value to avoid overflow
                int area = (j-i)*Math.min(height[i],height[j]);
                maxArea = Math.max(area, maxArea);
            }
        }

// Maximum area achieved
        return maxArea;
        
    }
}
