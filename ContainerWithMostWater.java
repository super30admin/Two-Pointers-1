// Time Complexity : O(n)
// Space Complexity : O(1)
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height == null ||height.length == 0)
            return 0;
        
        int n = height.length, max = 0;
        int low = 0, high = n-1;
        
        while(low < high)
        {
            int w = high - low; // width of the container
            int h = Math.min(height[low], height[high]); // height of the container
            max = Math.max(max, w*h); 
            if(height[low] <= height[high])
            {
                low++; // find next column higher than current
            }
            else
            {
                high--;
            }
        }
        
        return max;
    }
}
