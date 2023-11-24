// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//Use two pointer, one at the beg and one at the end to calculate the area of the
//container. Increment or decrement the pointer where the height of the wall is low based
//on which side the low wall is present to search for container with larger area
class Problem3 {
    public int maxArea(int[] height) {
        int len = height.length;
        int low = 0;
        int high = len-1;
        int max = 0;
        while(low < high){
            if(height[low] <= height[high]){
                int area = height[low] * (high-low);
                if(area>max){
                    max = area;
                }
                low++;
            } else {
                int area = height[high] * (high-low);
                if(area > max){
                    max = area;
                }
                high--;
            }
        }
        return max;
    }
}
