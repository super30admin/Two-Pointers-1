// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Containerwithwater {
    public int maxArea(int[] height) {
        int low =0;
        int max=0;
        int high = height.length-1;
        while(low<high){
            int current = (high-low)*Math.min(height[high],height[low]);
            max = Math.max(current,max);
            if(height[low]<height[high]) low++;
            else high--;
        }
        return max;
    }

}
