// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*
using the two pointer approach where first pointer starts at the first index and last pointer from the last.
we move the pointer that points to the bar with lower height since that can be that maximum area for the lower height bar.
*/


public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
           
        int maxArea=Integer.MIN_VALUE;
        int low=0, high=height.length-1;
        while(low<high)
            {

                        int w=high-low;
                        
                        int h = Math.min(height[low], height[high]);
                        
                        maxArea=Math.max(maxArea,w*h);

                        if(height[low]==height[high])
                        {
                            low++;
                            high--;

                        }
                        else if(height[low]<height[high])
                        low++;
                        else high--;
                        

            }
                
        
        return maxArea;

    
    }
    public static void main(String[] args)
    {
         int[] heights={1,8,6,2,5,4,8,3,7};
         System.out.println(maxArea(heights));
    }

}
