// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yess
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach: We use two pointer approach here
class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int rp=0;
        int lp=n-1;
        int maxArea=0;
        for(int i=0; i<n;i++){
            while(rp<=lp){
                int area= Math.min(height[rp],height[lp])* (lp-rp);
                maxArea=Math.max(maxArea,area);

                if(height[rp]< height[lp]){
                    rp++;
                }
                else{
                    lp--;
                }
            }
        }
        return maxArea;
    }
}
