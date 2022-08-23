public class WaterContainer {
    // TC is O(n)
    // SC is O(1)
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int max = Integer.MIN_VALUE;
        while(low<=high){
            int diff = high-low;
            int min;
            if(height[low]<height[high]){
                min = height[low];
                low++;
            }else{
                min = height[high];
                high--;
            }
            max = Math.max(max, diff*min);
        }
        return max;
    }
}
