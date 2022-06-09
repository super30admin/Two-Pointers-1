// Time Complexity: O(n)
// Space Complexity: O(1)


public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        // Declare two variables left and right pointers
        int l = 0;
        int r = height.length - 1;
        int area = Integer.MIN_VALUE;
        // loop until the condition fails
        while(l < r){
            // Get the the minimum height
            int h = Math.min(height[l], height[r]);
            // Width should be right pointer - left pointer
            int w = r - l;
            // Calculate the area and store the max area
            area = Math.max(area, h*w);
            // If the element in left pointer is less than right pointer then increment left pointer else increment right pointer.
            // I am doing this inorder to find the max height so that the area will be maximum
            if(height[l] < height[r])
                l++;
            else r--;
        }
        return area;
    }
}
