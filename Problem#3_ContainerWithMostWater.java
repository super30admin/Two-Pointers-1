/*
 * Time complexity: O(N) we would traverse the aray atleast once.
 * Space complexity: O(1) no extra space is used so it's constant.
 * */
class Solution {
    public int maxArea(int[] height) {
        //Calculate the heights from left and right
        // the height on either left or right - min/max will decide the boundary of container.
        //Brute force - O(N^2)  2 for loops
        //Better approach O(N) - two pointers
        int maxWater = 0;
        int start = 0;
        int end = height.length -1;
        
        //Until both indices meet
        while(start<end){
            //Check the area/water stored in this region
            maxWater = Math.max(maxWater, Math.min(height[end], height[start])*(end-start));
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxWater;
    }
}