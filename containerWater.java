/* 11. Container With Most Water
Time Complexity: O(n^2) => Calculating area for all n(n-1)/2 height pairs
Space Complexity: O(1)
*/


class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int n = height.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int h = Math.min(height[i], height[j]);
                int width = j-i;
                int area = h * width;
                if(area > maxArea)
                    maxArea = area;
            }
        }
        return maxArea;
    }
}


/* 11. Container With Most Water
Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max_area = Integer.MIN_VALUE;
        int left = 0, right = n-1;
        int h, area;
        while(left < right){
            h = Math.min(height[left], height[right]);
            area = h * (right-left);
            if(area > max_area)
                max_area = area;
            if(height[left] < height[right])
                left++;
            else right--;
        }
        return max_area;
    }
}