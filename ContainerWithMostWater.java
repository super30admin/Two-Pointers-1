/*TC - O(N)
 *SC - O(1)
 *Ran on leetcode  - yes
 * */
// Approach - move the pointer that is smaller in height, since the water capacity os limited by the lower height

class Solution {
    public int maxArea(int[] height) {
        // 2 pointer approach
        int lo = 0 ;
        int hi = height.length-1;
        int maxi = Integer.MIN_VALUE;
        while(lo <= hi){
             maxi = Math.max(maxi, Math.min(height[hi], height[lo])* (hi-lo));
            if (height[lo] < height[hi]){
                lo +=1;
            } else {
                hi -=1;
            }


        }
       return maxi;
    }
}
