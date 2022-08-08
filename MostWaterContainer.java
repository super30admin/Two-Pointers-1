// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES


class MostWaterContainer {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int n = height.length;
        int max = 0;

        //here, we will use two pointer and set it to the endpoints.
        int low=0, high=n-1;

        //once we calculate the area and compare it with max area till the point and move away from the smaller heights among both of them.
        while(low<high){
            int currArea = (high-low)*Math.min(height[high], height[low]);
            max = Math.max(max, currArea);
            if(height[high]>height[low]){
                low++;
            } else {
                high--;
            }
        }

        return max;
    }
}