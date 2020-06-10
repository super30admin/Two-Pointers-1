/**
 * Time Complexity: O(n) where n = size of height array
 * Space COmplexity : O(1)
 */

public class ContainerWithMostWater{
    public int maxArea(int[] height) {
        if(height == null || height.length <=1) return 0;
        int n = height.length; int high,low,max;
        low = 0; high = n-1;
        max = 0;
        while(low<high){
            int curr = (high-low)*Math.min(height[low],height[high]);
            max = Math.max(max,curr);
            if(height[low]<=height[high]) low++;
            else high--;
        }
        return max;
    }

    public static void main(String[] args){
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] myArr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println("Max area: "+obj.maxArea(myArr));
    }
}