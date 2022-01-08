public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        if(height == null || height.length == 0) return 0;

        int low =  0, high = height.length - 1, max = 0;

        while(low < high){
            max = Math.max(max, Math.min(height[low],height[high]) * (high - low));
            if(height[low] >= height[high]){
                high--;
            }else{
                low++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Container with a max area: " + maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}
