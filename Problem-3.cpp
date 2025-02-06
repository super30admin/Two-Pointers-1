// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Have two pointers at the beginning and end of the array
// maximum area contained is the product of minimum height and the distance between the two pointers
// Calculate the max value 
class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int i=0, j = n-1;
        int ans = 0;
        while(i<j){
            if(height[i]<height[j]){
                ans = max(ans, height[i]*(j-i));
                i++;
            }
            else{
                ans = max(ans, height[j]*(j-i));
                j--;
            }
        }
        return ans;
    }
};