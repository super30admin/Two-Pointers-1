// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int currMaxArea = 0;
        while(low<high){
            int Area = (high-low)*Math.min(height[low], height[high]);
            currMaxArea = Math.max(currMaxArea, Area);
            if(height[low]<=height[high]) low++;
            else high--;
        }
        return currMaxArea;
    }
}