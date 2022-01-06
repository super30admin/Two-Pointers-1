//TimeComplexity O(n)
//Space Complexity O(1)

public class ContainerwithMostWater{

    public int maxArea(int[] height) {
        int max =0;
        int low =0;
        int high = height.length-1;
        while(low<high){
            max = Math.max(max, Math.min(height[low],height[high]) * (high-low));
            if(height[low]<= height[high]){
                low++;
            }else
            high--;
        }

        return max;

    }


}
