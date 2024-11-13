//11. Container with Most Water - https://leetcode.com/problems/container-with-most-water/description/
//Time Complexity: O(n^2)
//Space Complexity: O(1)

// Brute Force
class Solution {
    public int maxArea(int[] height) {
        //base case
        if(height == null || height.length == 0){
            return 0;
        }
        int n = height.length; int maxArea = 0;
        //height indexes
        for(int i=0; i<n-1; i++){
            //container indexes
            for(int j=i+1; j<n; j++){
                int currArea = (j-i) * Math.min(height[i], height[j]); //width * height
                maxArea = Math.max(maxArea, currArea);
            }
        }
        return maxArea;
    }
}

//Two-Pointer
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        //base case
        if(height == null || height.length == 0){
            return 0;
        }
        int n = height.length; int maxArea = 0;
        int low = 0; int high = n-1;
        while(low < high){
            int currArea = (high - low) * Math.min(height[low], height[high]);
            maxArea = Math.max(maxArea, currArea);
            if(height[low] < height[high]){
                low++;
            }else {
                high--;
            }
        }
        return maxArea;
    }
}
