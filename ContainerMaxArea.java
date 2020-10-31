// Time Complexity :  O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//Brute force

// class Solution {
//     public int maxArea(int[] height) {
//         if(height == null || height.length == 0) return 0;
        
//         // int low = 0;
//         // int high = height.length - 1;
//         int max = 0;
//         for(int low = 0;low < height.length; low++){
//             for(int high = low + 1; high < height.length; high++){
//                 max = Math.max(max, Math.min(height[high], height[low]) * (high - low));
//             }
//         }
//         return max;
//     }
// }
//only move the pointer that has smaller height - intuitive, moving smaller one will increase area when it is replaced by a bigger one
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while(low< high){
            max = Math.max(max, Math.min(height[high], height[low]) * (high - low));
            if(height[low] < height[high])
                low++;
            else{
                high--;
            }
        }
        return max;
    }
}