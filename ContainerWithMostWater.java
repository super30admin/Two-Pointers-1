// Brute force:
// Time Complexity: O(n^2)
// Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i=0; i<height.length; i++) {
            for(int j=i+1; j<height.length; j++) {
                int water = Math.min(height[i], height[j]) * (j-i);
                if(water> max) {
                    max = water;
                }
            }
        }
        return max;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
 public int maxArea(int[] height) {
     int max = 0;
     int left = 0, right = height.length - 1;

     while(left < right) {
         int water = Math.min(height[left], height[right]);
         if((water*(right-left))>max) {
             max = water * (right-left);
         }
         if(height[left]<height[right]) {
             left++;
         } else {
             right--;
         }
     }
     return max;
 }
}