public class MostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            if(area > maxArea){
                maxArea = area;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
