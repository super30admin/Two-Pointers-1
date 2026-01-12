/*
Problem - Container With Most Water
Approach - Start with two pointers at both ends and keep checking the area between them.
Move the pointer pointing to the shorter line.
Keep track of the maximum area found during this process.
Time Complexity - O(n)
Space Complexity - O(1)
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h =0;// initializing height to compute the height on how the pointer moves
            int width = right - left;
            if(height[left]<height[right]) {
                h  = height[left]; // In this case, the left line is shorter than the right line, which means that the left line limits the water's height. Therefore, to find a larger container, let's move the left pointer inward to maximize the area
                left++;
            }
            else {
                h  = height[right];  //In this case, the left line is shorter than the right line, which means that the left line limits the water's height. Therefore, to find a larger container, let's move the left pointer inward:
                right--;
            }
            int area = h * width; // compute the area
            maxArea = Math.max(maxArea, area); // compute the maxArea
        }

        return maxArea;
    }
    public static  void main(String[] args) {
        ContainerWithMostWater maxArea = new ContainerWithMostWater();
        int[] heights = {};
        System.out.println(maxArea.maxArea(heights));
        int[] heights2 = {1};
        System.out.println(maxArea.maxArea(heights2));
        int[] heights3 = {0,1,0};
        System.out.println(maxArea.maxArea(heights3));
        int[] heights4 = {3, 3, 3, 3};
        System.out.println(maxArea.maxArea(heights4));
        int[] heights5 = {1, 2, 3};
        System.out.println(maxArea.maxArea(heights5));
        int[] heights6 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea.maxArea(heights6));
    }
}
