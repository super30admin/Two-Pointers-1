// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Maxarea stores the maxarea till now. We traverse throught the array and keep calculating the area between left and right index
// we update the pointer away from the lesser value one as we try to achieve max area
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int l = 0;
        int r = height.length - 1;
        int currarea = 0;
        while(l<r){
            currarea = Math.min(height[l],height[r])*(r-l);
            maxarea = Math.max(maxarea, currarea);

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
            
        }
        return maxarea;
    }
}