public class maxAreaContainer {
    public int maxArea(int[] height) {
        int result = 0;
        int low = 0;
        int high = height.length - 1;
        while(low < high) {
            result = Math.max(result, Math.min(height[low], height[high]) *(high - low));
            if(height[low] < height[high]) {
                low ++;
            } else {
                high--;
            }
        }   
        return result;
    }
}