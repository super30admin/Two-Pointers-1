package TwoPointers1;

public class question36_containerWithMostWater {

    /*
        Brute Force
            Time Complexity: O(n ^ 2)
            Space Complexity: O(1)

            Time Limit Exceeded
     */
    public static int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        for(int i = 0 ; i < height.length ; i++) {
            for(int j = i + 1 ; j < height.length ; j++) {
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            }
        }
        System.out.println(maxArea);
        return maxArea;
    }

    /*
        Using one while loop
            Time Complexity: O(n)
            Space Complexity: O(1)
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        int low = 0;
        int high = height.length - 1;

        while(low < high) {
            maxArea = Math.max(maxArea, Math.min(height[high], height[low]) * (high - low));

            if(height[low] < height[high]) low++;
            else high--;
        }
        return maxArea;
    }



    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        maxAreaBruteForce(height);
    }
}
