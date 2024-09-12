
/*
TC : O(n) single pass
SC :O(1)
Leetcode : yes
Problems faced : no
 */

/**
 * The basic approach used here is that at any stage, we maintain two pointers pointing to the left left line and right line.
 * The area is restricted by the smaller line. Therefore we move the smaller line towards the other line in search of a greater line
 * Also, we move the smaller line until we find a line greater than that
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {


        int left=0, right=height.length-1, max=0;
        while(left<right)
        {
            max = Math.max( max,Math.min( height[left], height[right]) * (right-left));
            if(height[left] < height[right])
            {
                int previousLeft = height[left];
                while(height[left]<=previousLeft && left < right)
                {
                    left++;
                }
            }
            else{
                int previousRight = height[right];
                while(height[right] <= previousRight && left < right)
                {
                    right--;
                }
            }
        }
        return max;
    }
}
