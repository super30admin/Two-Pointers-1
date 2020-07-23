// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes


// Your code here along with comments explaining your approach
  //strting from both ends,
  //try to move towards more favourable outcome,
  //by incrementing lower hight pointer to look at larger height.
  //keep storing the max found.
class Solution {
    public int maxArea(int[] height) {
        int strt = 0;
        int end = height.length -1;
        int mx = 0;
        while(strt < end){
            int minHeight = Math.min(height[strt], height[end]);
            mx = Math.max(mx, (end-strt)* minHeight);
            if(minHeight == height[strt]){
                strt++;
            }
            else
                end--;
        }
        return mx;
    }
}
