// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxVolume = 0;
        int i = 0;
        int j = height.length -1;

        while(i<j){
            int volume = returnMin(height[i], height[j]) * (j-i);

            if(volume > maxVolume){
                maxVolume = volume;
            }

            if(height[i]  >height[j]){
                j--;
            } else {
                i++;
            }

        }
        return maxVolume;
    }

    private static int returnMin(int a, int b){
        return (a<b) ? a : b;
    }

    public static int maxAreaBruteForce(int[] height) {
        int maxVolume = 0;

        for(int i = 0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++){
                int volume = returnMin(height[i], height[j]) * (j-i);
                if(maxVolume < volume){
                    maxVolume = volume;
                }
            }
        }

        return maxVolume;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
        System.out.println(maxAreaBruteForce(nums));

    }

}
