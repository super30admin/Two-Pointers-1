// Time Complexity : o(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//For getting maximum water - two pointer approach one on left and other on right.
//have variable total to store the value of maximum and travering through array to compare the value if its max than previous one.
// if yes then change value max else keep compairing 
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int total = 0;
        while (l < r) {
         total =  Math.max(total,Math.min(height[l],height[r]) * (r - l));
         if(height[l]< height[r]){
             l++;
         }
         else{
             r--;
         }
        }
        return total;
        
    }
}