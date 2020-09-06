// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach



class Solution {
public:
    int maxArea(vector<int>& height) {
     
        int left = 0;
        int right = height.size() -1;
        int max = 0;

        // initializing max with the container with max width
        if ( height[left] >= height[right]) 
                 max = height[right]*(right-left);
        else
                 max = height[left]*(right-left);
        
        int temp;
        while (left<right){
           if ( height[left] >= height[right]) {
               right -=1;
           }
            else {left +=1;
                 }
                 // if the containers in between have high area then updating the max
             if ( height[left] >= height[right]) 
                 temp = height[right] * (right-left);
            else
                temp = height[left] * (right-left);
            if (  temp> max){
                max = temp;
            
            }
            
        }
        return max;
    }
};