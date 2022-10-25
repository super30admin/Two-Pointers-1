package s30.arrays.twoPointers;

//Time Complexity : O(n);
//Space Complexity: O(1);

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left =0;
        int right = height.length-1;
        int maxArea = -1;

        while(left < right){
            int area = (right - left) * Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea,area);

            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;

    }
    public static void main(String[] args) {

    }
}
