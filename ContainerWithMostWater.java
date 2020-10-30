// Time Complexity : O(n) where  n is size of the input array
// Space Complexity : O(1) no extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 *We used a two pointers approach to solve the problem in single pass.
 * One pointer will start from the beginning of the array and other pointer from the end.
 * Calculate the area at each step and update the pointer which is smaller in height
 *  */


public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        //edge
        if(height==null || height.length==0) return 0;

        int low=0, high=height.length-1;
        int maxArea = 0;
        while(low<high){
            int area = Math.min(height[low], height[high])*(high-low);
            maxArea = Math.max(area,maxArea);
            if(height[low]<height[high]){
                low++;
            }else {
                high--;
            }
        }
        return maxArea;
    }
}