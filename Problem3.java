//Time = O(n)
//Space = O(1)

class Solution {
    public int maxArea(int[] height) {
        int left = 0; // initialize left pointer to the start of the array
        int right = height.length - 1; // initialize right pointer to the end of the array
        int maxArea = 0; // initialize maxArea to 0
        while (left < right) { // loop until left pointer is less than right pointer
            int area = Math.min(height[left], height[right]) * (right - left); // calculate the area of the container
            maxArea = Math.max(maxArea, area); // update maxArea if necessary
            if (height[left] < height[right]) { // move the pointer with the smaller height
                left++;
            } else {
                right--;
            }
        }
        return maxArea; // return the maximum area
    }
}
