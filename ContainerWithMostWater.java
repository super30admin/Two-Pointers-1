//Time Complexity: O(n)
//Space Complexity: O(1)
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        int n = height.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int area = (high-low)*Math.min(height[low],height[high]);
            if(area > max){
                max = area;
            }
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}
