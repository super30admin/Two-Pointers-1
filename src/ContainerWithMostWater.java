// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Two Pointer - calculating area and moving l=minimum of low and high by one till they cross eachothe
// and maintaining the max
public class ContainerWithMostWater {
        public int maxArea(int[] height) {
            int l = 0;
            int h = height.length-1;
            int max =-111;
            while(l<h) {
                int area = (h-l) * Math.min(height[l],height[h]);
                max = Math.max(area, max);
                if(height[l] < height[h]) {
                    l++;
                }
                else if( height[l] == height[h]) {
                    l++;h--;
                }
                else {
                    h--;
                }
            }
            return max;

        }
}
