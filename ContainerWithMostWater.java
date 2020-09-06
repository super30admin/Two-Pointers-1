// Time Complexity : O(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
Area = minimum of height * distance between containers.
Take a left and right pointer, calculate the area. 
If the height at left is lesser than height at right, then moving ahead to a greater height would increase area.
Similarly, if height at right is lesser than height at left, then decrement right to see if we can get a better height for right.
At each step store the max value of area.
*/


class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length <= 1 ){
            return 0;
        }
        int left =0;
        int right = height.length-1;
        int max_area = Integer.MIN_VALUE;
        //needs to have atkeast two elements
        while(left<right){
            int area = Math.min(height[left], height[right]) * (right-left);//calculate the area 
            max_area = Math.max(max_area, area);//store the max value
            //check if for the same hight of right, we get a better height of left to increase area
            if(height[left]<height[right]){
                left++;
            //check if for the same hight of left, we get a better height of right to increase area
            }else{
                right--;
            }
        }
        //return max area
        return max_area;
    }
}