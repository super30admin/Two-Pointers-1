// TC=O(N),SC = O(1)
public class ContainerWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int amount = Math.min(height[low],height[high]) * (high-low);
            if(amount>max){
                max = amount;
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

    public static void main(String[] args) {
        System.out.println(ContainerWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
