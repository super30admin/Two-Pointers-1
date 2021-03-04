// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/*Need to find the max area of a rectangle in an array to fill more water. 
For the area to be maximum we need to find the higher values in left and right with maximum width.
So I have taken two points, which traverse towards middle. 
During this maximum area is calculated as the min of left and right heights to keep the container straight and to avoid slant.
And the max of width between them is taken and area is calculated as the container with most water.
*/

// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0) return 0;
        int result = 0,left=0,right = height.length-1;
        while(left<=right){
            result = Math.max(Math.min(height[left],height[right])*(right-left),result);
            if(height[left]<height[right])
                left++;
            else 
                right--;
        }
        return result;
    }
}
