// TC - O(n), SC - O(1), Two Pointer approach

class Solution {
    public int maxArea(int[] height) {
        // Storing array length in length variable
        int length = height.length;
        // Initializing 2 pointers, l and h to starting and ending index of height array
        int l=0;
        int h = length-1;
        //Initializing max value to Integer.MIN_VALUE
        int max = Integer.MIN_VALUE;
        // Iterating till l is less than h
        while(l<h){
            // Comparing current area of l and h by multiplying min of value of l, h of height array and h-l, previous max
            max = Math.max((Math.min(height[l], height[h]) * (h-l)), max);
            // Comparing values of l and h indexes from height array
            // If l is less, increment l else decrement h
            if(height[l] < height[h]){
                l++;
            }else{
                h--;
            }
        }
        return max;
    }
}


// BruteForce - O(n^2)
// class Solution {
//     public int maxArea(int[] height) {
//         int length = height.length;
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<length-1; i++){
//             for(int j=i+1; j<length; j++){
//                 max = Math.max(max, (Math.min(height[i], height[j]) * (j-i)));
//             }
//         }
//         return max;
//     }
// }