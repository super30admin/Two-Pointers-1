// Time Complexity :O(nˆ2) --> beacuse of for loop
// Space Complexity :1
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. For each height calculate area with next available heights and update max if area>max area.
// 2. Do this for all heights in array.
public class containerWithMostWater {
    //Brute force
    public static int maxArea(int[] height) {
        int max = 0;
        for(int i = 0;i<height.length-1;i++){
            for(int j = i+1;j<height.length;j++){
                max = Math.max(max,((j-i)*Math.min(height[i],height[j])));
            }
        }
        return max;
    }
    //TWO POINTER APPROACH
    // Time Complexity :O(n) --> beacuse of for loop
    // Space Complexity :1
    // 1 . Use two pointers start and end for starting and ending points of array. Calculate area.
    // 2 . For next step , since we are reducing width , we need to maximize height . So Update lower value of start/end to next/previous value accordingly.
    // 3 . For each step calculate area and update max area .
    public static int maxArea2(int[] height){
        int max = 0;
        int start = 0,end = height.length-1;
        while(start<end){
            int area = Math.min(height[start],height[end])*(end-start);
            max = Math.max(max,area);
            if(height[start]<height[end]) start++;
            else end--;
        }
        return  max;
    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea2(height));
    }
}
