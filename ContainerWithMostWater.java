package S30.TwoPointers_1;

/*
Time Complexity : Put: O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        if(height == null || height.length == 0) return 0;

        int start = 0;
        int end = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while(start < end){

            int area = (Math.min(height[end], height[start]))*(end-start);
            maxArea = Math.max(area,maxArea);

            //if start is smaller than end, the next start may be higher leading to a possible gain in area
            //only if that gain in area offsets the loss in area due to width reduction
            if(height[start] <= height[end]) start++;
            else end--;

        }
        return maxArea;

    }
}
