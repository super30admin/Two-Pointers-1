// Time Complexity : O(n)
// Space Complexity: O(1)

// Approach:
//     Loop thorugh the array, where i point to 0th index element & j to array.length-1 index element
//     Compare both the elements present at ith & jth index
//     if arr[i]<arr[j] move the ith element; else j--;

class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        
        int water = 0;
        while(i<j){
            int prod = Math.min(height[i], height[j])*(j-i);
            water = Math.max(water,prod);
            if(height[i]<height[j]){
                i++;
            } else{
                j--;
            }
        }
        return water;
     }
}