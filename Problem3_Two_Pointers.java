// Time Complexity - O(n)
// Space complexity - O(1)

// two pointers approach

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int low = 0;
        int high = height.length-1;
        while(low < high){
            int area = (high-low)*(Math.min(height[low],height[high]));
            if(height[low]>height[high]){
                high--;
            }else{
                low++;
            }
            max = Math.max(max,area);
        }
        return max;
    }
}
