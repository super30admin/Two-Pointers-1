// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//1. Edge case
//return when size is 2
//2. Logic
//A.move left when less or else move right
//B. store appropriate result
class Solution {
    
    int return_max_area(vector<int>& height){
        int left=0;
        int right = height.size()-1;
        int max_area= min(height[left] , height[right]) * (right-left);
        int current_area=0;
        while(left<right){
            if(height[left]<height[right]){
                current_area = min(height[left] , height[right]) * (right-left);
                left++;
            }else{
                current_area = min(height[left] , height[right]) * (right-left);
                right--;
            }
            
            max_area = max(max_area,current_area );
        }
        return max_area;
    }
public:
    int maxArea(vector<int>& height) {
        if(height.size()==2){
            return min(height[0], height[1]);
        }
        
        return return_max_area(height);
    }
};
