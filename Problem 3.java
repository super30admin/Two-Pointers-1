// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// We need to get the biggest area
// which is calculated by width * height , width is the distance between two containers , and height would be the height of the smaller of two       
// we need to get most height and width, but would prefer most height containers always
class Solution {
    public int maxArea(int[] height) {


        // we will solve it with two pointers approach

        int left = 0;
        int right = height.length-1;


        int max = Integer.MIN_VALUE;
        while(left<right){

            int h = height[left] < height[right] ? height[left] : height[right];
            int area = h * (right-left);
            if(area > max){
                max = area;
            }

            // now we will decide which pointer to move
            // since we always want bigger height , so we will move the smaller one

            if(height[right] <= height[left]){
                right --; // move right as its smaller
            }else{
                left++; // move left as its smaller
            }


        }

        return max;
        
    }
}