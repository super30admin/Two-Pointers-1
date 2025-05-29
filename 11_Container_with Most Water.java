// Approach:
// Use two pointers starting at both ends of the array and move inward, calculating the area formed between the lines at these pointers. 
//   At each step, move the pointer pointing to the shorter line to try to find a taller line and potentially increase the area. 
//   Keep track of the maximum area found during this process.

// Time Complexity: O(n), since each pointer moves inward at most n times.
// Space Complexity: O(1), as no extra space is used.

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0;
        int r = n-1;
        int max = 0; 
        while(l < r){
            int curr = Math.min(height[l],height[r]) * (r-l);
            max = max > curr ? max : curr;
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
