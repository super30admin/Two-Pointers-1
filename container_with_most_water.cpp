// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// start with the widest width possible using two diff pointers
// increment or decrement left and right pointers based on which side has the lesser height


class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.size()==0){
            return 0;
        }
        int global_max;
        int left=0;
        int right= height.size()-1;
        
        while(left < right){
            int curr_max = (right-left) * min(height[left],height[right]);
            global_max= max(curr_max,global_max);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return global_max;
    }
};