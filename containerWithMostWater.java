/*Time complexity : O(n). We are doing it in Single pass.
Space complexity : O(1). Constant space is used.

Approach:

The intuition behind this approach is that the area formed between the lines will always be limited by the height of the shorter line and farther the lines, the more will be the area obtained.

-I am taking two pointers, one at the beginning and one at the end of the array constituting the length of the lines. 
-I am maintaining a variable maxarea to store the maximum area obtained till now. 
-At every step, we find out the area formed between them, update maxarea and move the pointer pointing to the shorter line towards the other end by one step.
*/
class Solution {
    public int maxArea(int[] height) {
        //edge case
        if(height == null || height.length ==0)
            return 0;
        int total= 0;
        int left=0, right=height.length-1;
        while(left < right){
            total = Math.max(Math.min(height[right], height[left]) *(right-left), total);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return total;
    }
}
