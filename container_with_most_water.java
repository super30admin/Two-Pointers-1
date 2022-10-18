// TC - O(n)
// SC - O(1)
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int area = 0;
        while(start<end){
            if(height[start] < height[end]){
                int newArea = height[start] * (end-start);
                area = Math.max(area,newArea);
                start++;
            }
            else{
                int newArea = height[end] * (end-start);
                area = Math.max(area,newArea);
                end--;
            }
        }
        return area;
    }
}