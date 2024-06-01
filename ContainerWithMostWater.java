/***
 *Using 2 pointers approach
 *TC - O(n), SC - O(1)
 */
class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int left =0, right = height.length-1;
        int max = Integer.MIN_VALUE;

        while(left < right) {

            //calculate area with lesser height and move left pointer as this will be max area possible with that height

            if(height[left] <= height[right]) {
                max = Math.max(max, height[left] * (right-left));
                left++;
            }

            else {
                max = Math.max(max, height[right] * (right-left));
                right--;
            }
        }

        return max;
    }
}