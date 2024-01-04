// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N


public class Container {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int l =0;
        int r = n-1;
        int max =0;
        while(l<r)
        {
            int currArea = Math.min(height[l],height[r]) * (r-l);
            max = Math.max(max,currArea);
            if(height[l]<height[r])
            {
                l++;
            } 
            else
            {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        Container c = new Container();
        System.out.println("Max area is :: "+c.maxArea(arr));
    }
}
