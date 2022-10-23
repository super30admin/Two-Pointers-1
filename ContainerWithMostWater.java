package S30_Codes.Two_Pointers_1;

// TIme Complexity = O(n) // n = height.length
// Space Complexity = O(1)
// Two-Pointers-1

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left<right){
            int distance = right-left;
            int minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(distance*minHeight, maxArea);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
