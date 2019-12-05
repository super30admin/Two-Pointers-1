//Time Complexity - O(n)
//Space Complexity - O(1)
//This solution worked on Leetcode
//In this problem, I need to find the maxarea that can hold the water.


public class Solution {
    public int maxArea(int[] height) {
    //Egde Case
        if(height==null || height.length==0){
            return 0;
        }
        //inituialize maxarea with 0
        int maxarea = 0;
        int i=0;  //first pointer starts at 0
        int j = height.length-1;  //second pointer starts at the end of the height array
        while(i<j){
            maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));  //Minimum of the height will hold water and (j-i) will give the width
            if(height[i]>height[j]){ //If height[j] is smaller than height[i] We need to keep the i and decrement the j. So that higher height are left to calculate the max area 
                j--;
            }
            else{
                i++;    //Else increment i if j height is greater
            }
        }
                
        return maxarea;
    }
}
