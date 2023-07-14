public class ContainerWithMostWater {
        public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while(leftPointer < rightPointer){
            int area = Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);
            if(height[leftPointer] < height[rightPointer]){
            leftPointer ++;
        }else{
            rightPointer--;
        }
        maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    
}
