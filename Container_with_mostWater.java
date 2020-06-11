/*

Time Complexity : O(N^2)
space complexity : O(1)
is Worked on leetcode : YES

*/

public class Container_with_mostWater{
    public int maxArea(int[] height) {
        if( height == null || height.length == 0) return 0;
        int max = 0;
        int n  = height.length;
        for(int i=0; i< n-1;i++){
            for(int j=i+1;j<n;j++){
//                 width * min height of two bar
                int new_area = (j-i) * (Math.min(height[i],height[j]));
                max = Math.max(max, new_area);
            }
        }
        return max;
    }
}