// Time Complexity: O(n) Each pointer moves n times
// Space Complexity: O(1) Constant Space
// Ran on leet code: Yes
// Ran into any problems: No

public class ContainerWithMostWater {
    public int maxArea(int [] height){
        int left = 0; // initialize the left pointer to first element in Array
        int right = height.length - 1; // Initialize right pointer to last element in array
        int maxArea = 0;

        while (left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;

    }

    public static void main (String [] args){
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int [] height = {8,7,2,1};
        System.out.println(solution.maxArea(height));

    }
}
