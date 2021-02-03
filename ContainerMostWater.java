// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class ContainerMostWater {
    public int maxArea(int[] height) {
        if(height ==null || height.length==0){
            return 0;
        }
        //Maintaining two pointer, left and right
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            //We will calculate the max(area) for the particular left and right value and then compare with max 
            max = Math.max(max,(right-left)*Math.min(height[right],height[left]));
            //Then will increase the left pointer if lefts height is less or decrease the right pointer if the rights
            //height is less
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}