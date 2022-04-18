class ContainerWithMostWater {

    // Time Complexity : 0(n) where n is the no. of elements in the array
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: I have set 2 pointers left and right. Left is pointing to the
    //1st index in the array and right to the last. Then I take the minimum of left and right and multiply is by the width
    //to get the area and compare it with max in each iteration. I then increment my left and right pointers with the condition
    //that if the left pointer is less than right than will increment left pointer or right in order to maximize the area.

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            max = Math.max(max, Math.min(height[left],height[right]) * (right-left));
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