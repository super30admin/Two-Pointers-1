public class ContainerWithMostWater {
        public int maxArea(int[] height) {
            int low =0;
            int high = height.length-1;
            int maxArea = 0;
            while(low<high){
                int width = high - low;
                int h = Math.min(height[high],height[low]);
                maxArea = Math.max(maxArea,width*h);

                if(height[low]<height[high])
                    low++;
                else
                    high--;
            }
            return maxArea;
        }
        public static void main(String[] args){
            ContainerWithMostWater c = new ContainerWithMostWater();
            int[] height = {1,8,6,2,5,4,8,3,7};
            System.out.print(c.maxArea(height));
        }
}
