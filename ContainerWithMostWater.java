
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
    }

    public static  int maxArea(int[] height) {
        int n = height.length;
        if(height == null || n==0 )
            return 0;

        int max = 0;  // S.C - O(1)
        int start = 0, end=n-1;

        while(start<end){ // T.C - O(N) Traversing only once
            max = Math.max(max, Math.min(height[start], height[end])*(end-start));
            if (height[start] < height[end]){
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
