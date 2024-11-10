// Time Complexity : //TC: O(N)
// Space Complexity : //SC: O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

//https://leetcode.com/problems/container-with-most-water/description/
// Your code here along with comments explaining your approach

class Problem3 {
    //TC: O(N)
    //SC: O(1)
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;

        int maxVol = 0;

        while(l<r){
            int vol = Math.min(height[l],height[r])*(r-l);
            maxVol = Math.max(maxVol,vol);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxVol;
    }
}