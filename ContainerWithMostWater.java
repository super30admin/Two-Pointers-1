// In this problem, we are using two pointers, one at 0(left) and other at (height.length-1)(right). Running a loop till left is less 
// than right. In each iteration, we are computing the area and storing it in max if it is greater than the current max. Then moving 
// left pointer if height[left]<height[right] else moving right.

// Time Complexity : O(n) ==> n is the length of height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Brute force approach with TC O(n^2) and giving time limit exceeded when submitted
// class Solution {
//     public int maxArea(int[] height) {
//         if(height.length<2||height==null){
//             return 0;
//         }
//         int max=0;
//         for(int i=0;i<height.length;i++){
//             for(int j=i+1;j<height.length;j++){
//                 max=Math.max(max,Math.min(height[i],height[j])*(j-i));
//             }
//         }
//         return max;
//     }
// }

// Optimized approach by using two pointers
class Solution {
    public int maxArea(int[] height) {
        // Checking base case
        if (height.length < 2 || height == null) {
            return 0;
        }
        // Declaring a max variable
        int max = 0;
        int n = height.length;
        // Two pointers left and right
        int left = 0;
        int right = n - 1;
        // Iterate till left<right
        while (left < right) {
            // Compute the area and compare with current max, and modify if required
            // Area of container is given by height * width: where height is the min height
            // of height[left],height[right] and width is right index - left index
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            // Move left if height[left]<height[right]
            if (height[left] < height[right]) {
                left++;
            }
            // Else move right
            else {
                right--;
            }
        }
        // Return max
        return max;
    }
}
