//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(leftIndex<rightIndex){
            maxArea = Math.max(maxArea, Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex));
            if(height[leftIndex] > height[rightIndex])
                rightIndex--;
            else
                leftIndex++;
        }
        return maxArea;
    }
}