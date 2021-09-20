// APPROACH - Brute force
//Time complexity: O(n^2)
//Space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j-i));
            }
        }
        return maxarea;
    }
}

// 2 
// APPROACH : 2 pointer
//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max_area = 0;
        while(start < end) {
            max_area = Math.max((end - start) * Math.min(height[start], height[end]), max_area);
            if(height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return max_area;
        
        // public static void main(String[] args) {
//         System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
//     }
    }