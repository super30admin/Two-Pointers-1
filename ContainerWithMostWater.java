//Time Complexity - O(n)
//Space Complexity - O(1)
//Using a two pointer approach, we fix the left ptr to be at the index of the first height and right to the last. 
//Calculate the area of the rectangle and update the max. Proceed/Increment in the direction of the lower height element. 
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height.length == 0 || height == null){
            return -1;
        }
        int left = 0; 
        int n = height.length;
        int right = n - 1;
        int max = 0;
        while(left < right){
            max = Math.max(max, Math.min(height[left], height[right])* (right - left));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;

    }
}
