// Time Complexity : O(N) as we will run the while for max N times.
// Space Complexity : O(1) as we are using 2 pointers.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Struggled a bit deciding how I move my pointers.

public class MostWaterInContainer {
    public int maxArea(int[] height) {
        //start two pointers, one from 0 and other from last index
        int first = 0, last = height.length - 1;
        
        //initialize max to 0
        int max = 0;
        
        while(first < last) {
            int temp;
            //if height of left pointer is greater than right
            //then move the left pointer to right
            if(height[first] < height[last]) {
                temp = height[first] * (last-first);
                first++;
            } else {
            //else move right pointer to left
                temp = height[last] * (last-first);
                last--;
            }
            //update max
            if(temp > max) {
                max = temp;
            }
        }
        
        return max;
    }
}