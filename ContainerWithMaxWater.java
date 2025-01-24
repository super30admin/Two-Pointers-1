// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
public class ContainerWithMaxWater {
    public int maxArea(int[] height) {
        if(height==null||height.length<2)
            return 0;
        int max = Integer.MIN_VALUE;
        int n = height.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int volume = (right-left)*Math.min(height[left],height[right]);
            max = Math.max(max,volume);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}
