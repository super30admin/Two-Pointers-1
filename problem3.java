// Time Complexity: O(n) 
// Space Complexity: O(1)


// Using a two pointer approach and simultaneously keeping track of most area so far

class Solution {
    public int maxArea(int[] height) {
        
        if (height == null || height.length == 0) return 0;
        
        int maxWater = 0; // to store max water that can be stored
        int p1 = 0, p2 = height.length-1; // our 2 pointers, the two ends

        while (p1<=p2) {
            if (height[p1] > height[p2]) { // determining the smaller height out of p1 p2
                int water = ( p2 - p1 ) * height[p2]; 
                maxWater = Math.max(maxWater, water);
                p2--; // reduce p2 because p2 is smaller, there may exist a taller height to the left of p2
            } else {
                int water = ( p2 - p1 ) * height[p1];
                maxWater = Math.max(maxWater, water);
                p1++; // increase p1 because p1 is smaller, there may exist a taller height to the right of p1
            }
        }

        return maxWater;

    }
}
