/**
 * Idea : 
 * 1. Two pointers at left and right ends.
 * 2. Calculate area and compare with max and update accordingly.
 * 3. Move the pointer with the lowest height - left or right. Break when pointers meet.
 * 
 * Time Complexity: O(n) - single pass
 * Space Cmplexity: O(1) no extra space used
 * Leetcode: Yes
 */


class ContainerWithMostWater {

    public int maxArea(int[] height) {
        
		int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int minHeight = 0;
            boolean moveLeftPointer = false;
            if(height[left] < height[right]){
                minHeight = height[left];
                moveLeftPointer = true;
            }            
            else
                minHeight = height[right];
                

            int currArea = (right - left) * minHeight;
                
            if (maxArea < currArea){
                maxArea = currArea;
            }

            if(moveLeftPointer)
                left++;
            else
                right--;


        }


		return maxArea;
    }
    public static void main(String[] args){
        System.out.println("Container with most water");
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));

    }
}