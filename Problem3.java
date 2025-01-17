public class Problem3 {
    // Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
    public int maxArea(int[] height) {
        //approach -> area = height * width (index diff)
        if(height == null || height.length == 0){
            return 0;
        }
        int n = height.length;
        int max = 0;
        int i = 0;
        int j = n-1;
        while(i<j){
            int area = Math.min(height[i], height[j]) * (j-i);
            max = Math.max(max,area);
            //there can exist 2 condition either value at left is smaller or greater move accordingly.
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
