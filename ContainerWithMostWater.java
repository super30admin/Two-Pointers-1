public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        int low=0;
        int high=height.length-1;
        while(low<high){
            int currentArea=0;
            if(height[low]>height[high]){

                currentArea = height[high] * (high - low);
                high--;
            } else{
                currentArea = height[low] * (high - low);
                low++;
            }
            max=Math.max(max,currentArea);
        }
        return max;
    }
}
