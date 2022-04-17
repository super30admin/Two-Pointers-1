// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
/*

2 pointer approach is used. We calculate max area till that boundaries.
if the current height value is less than the right height value, we move left++ 
since we are in pursuit of finding bigger boundary.
If not, we move the right--.

*/
public class ContainerWithMostWater {
    
    public static int maxArea(int[] height) {
        
        if(height == null || height.length == 0)
        {
            return 0;
        }
        
        int max = Integer.MIN_VALUE;
        
        int left = 0;
        int right = height.length -1;
        
        while(left<right)
        {
            int width = right - left;
            
            int boundary = Math.min(height[left],height[right]);
            
            max = Math.max(max,boundary*width);
            
             if(height[left]<height[right])
             {
                 left++;
             }
            else
            {
                right--;
            }
        }
        
        return max;
    }

    public static void main(String args[])
    {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

}
