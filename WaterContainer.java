// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//We have a high and low pointer at each end of the array. Whichever height is lower between the two we will multiply
//it by the length and store in the max variable. We move whichever pointer is smaller inwards and keep finding areas
//until the pointers meet and we have found our max container.


public class WaterContainer {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2){
            return 0;
        }
        if(height.length == 2){
            return Math.min(height[0],height[1]);
        }
        int low = 0;
        int high = height.length - 1;
        int max = Integer.MIN_VALUE;

        while(low < high){
            //find area
            int smaller = Math.min(height[low], height[high]);
            int area = smaller * (high - low);

            //make max if bigger than max, move smaller one inwards
            max = Math.max(area,max);
            if(height[low] > height[high]){
                high--;
            }
            else{
                low++;
            }
        }
        return max;
    }
}