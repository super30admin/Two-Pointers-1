//TC : O(N) & SC : O(1)
//This is a two-pointer approach solution. Create two-pointer one denoting the start and the other one is 
//end denoting the first and last index of the array.Create a variable to store the max_area.
//Find the maximum of the area, with the Minimum of height(between the first and last element) * the length 
//between the two indexes. Move towards the higher height. Return the Max Area.
class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end = height.length -1;
        int area =0;
        while(start < end)
        {
            area = Math.max(area, Math.min(height[start], height[end]) * (end - start));
            
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        return area;
    }
}