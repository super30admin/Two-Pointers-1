/*
Time: O(N) single pass with two pointers
Space: O(1) no auxilary memory used
*/
public class ContainerWithMostWater {
    private static int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int max = Integer.MIN_VALUE;
        
        while(left < right){
            max = Math.max(max,Math.min(height[left], height[right]) * (right-left));
            if(height[left] >= height[right]) right--;
            else left++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
}
