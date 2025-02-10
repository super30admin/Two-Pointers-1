// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
calculate max wuidth using two pointers,moving the pointers based on the lower height
 */

public class ContainersWithMostWater {

    public static void main(String[] args) {

//        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        if(height  == null || height.length == 0) {
            return 0;
        }

        int n = height.length;
        int max = 0;
        int l = 0;
        int r = n - 1;

        while(l < r) {
            int curArr = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(max, curArr);

            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;

    }
}
