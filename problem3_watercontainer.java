// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class problem3_watercontainer {
        public int maxArea(int[] height) {
            int area = 0;
            int l = 0;
            int r = height.length - 1;
            int h;
            while(l<r){
                h = Math.min(height[l], height[r]);
                area = Math.max(area, h * (r-l));
                
                if(height[l]<=height[r]){
                    ++l;
                }
                else{
                    --r;
                }
            }
            return area;
        }
    }