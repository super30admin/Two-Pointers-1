/*
Run time complexity - O(N) - where N is the number of elements in the height array
Space complexity - O(1) - we are not using any extra space or data structure to store the intermediate answers.
*/

class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)
            return 0;
        int left=0; // Two pointer approach
        int right=height.length-1;
        int area=0;
        while(left<right) // We atleast two elements to make the comparison.
        {
            area=Math.max(area,Math.min(height[left],height[right])*(right-left)); // Compare the area with the previous max area.
            if(height[left]<=height[right]) // decide which pointer to move based on the lower number.
                left++;
            else
                right--;
        }
        return area;
    }
}
