// Time Complexity : O(n) where n = length of height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class Problem3 {
    
    public static int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int ans = 0;
        while (start < end) {
            // Update ans by maximum of ans and area between bars at start and end index
            // Move the pointer at index with shorter bar
            if (height[start] < height[end]) {
                ans = Math.max(ans, (end-start)*height[start]);
                start++;
            } else {
                ans = Math.max(ans, (end-start)*height[end]);
                end--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(height);
        System.out.println(ans);
    }
}
