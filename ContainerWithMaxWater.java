//The algorithm finds the maximum area between two lines represented by the height array using the two-pointer approach. 
//It initializes pointers left and right at the start and end of the array, respectively.
// The algorithm calculates the current area, updates the maximum area, and moves the pointers towards each other based on the shorter line, optimizing for the maximum area. 
//The time complexity is O(n), where n is the length of the input array height, space - O(1).
class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int n = height.length;
        int left =0, right = n-1;
        while(left<=right){
            int currArea = Math.min(height[left],height[right]) * (right-left);
            max = Math.max(max, currArea);
            if(height[left]< height[right]){
                left++;
            }
            else right--;
        }
        return max;
        
    }
}