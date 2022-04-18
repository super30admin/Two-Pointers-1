// Time Complexity : O(N) where N is the number elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Area= l*b --> b=min(l,r), move lr ptrs, b= difference btwn indexes

public class ContainerMostWater {
    public int maxArea(int[] height) {
        if(height.length==0 || height==null) return 0;

        int maxArea=0;

        int left=0,right=height.length-1;
        while(left<right){
            maxArea=Math.max(maxArea, (right-left)* Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }
}
