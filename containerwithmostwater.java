//Problem 11:Container with Most Water
//solved successfully on leetcode and faced no issues
//TC : O(n) , SC = O(1)

class Solution {
    //optimised : using two pointer approach
    public int maxArea(int[] height) {
        int maxarea = 0;
        int low = 0;
        int high = height.length - 1;
        while(low<high){
            int h = Math.min(height[low] , height[high]);
            int w = high - low;
            int area = h * w;
            maxarea = Math.max(area , maxarea);
            if(height[low]<=height[high]){low++;}
            else{high--;}
        }
        return maxarea;


    //Brute force approach : TC:O(n^2) Sc:O(1)
    // public int maxArea(int[] height) {

    //     int maxarea = 0;
    //     for(int i = 0 ; i < height.length ; i++){
    //         for(int j = i+1 ; j < height.length ; j++){
    //             int h = Math.min(height[i] , height[j]);
    //             int w = j - i;
    //             int area = h*w;
    //             maxarea = Math.max(area , maxarea);
    //         }
    //     }
    //     return maxarea;
        
    // }
  }
}