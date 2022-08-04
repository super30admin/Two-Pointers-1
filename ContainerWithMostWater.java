// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Two pointers  approach
class Solution {
    public int maxArea(int[] height) {
        
int max =0;
int n = height.length;
        int low = 0;
        int high = n-1;
        while(low < high){             
                    //area =h* w
                    //h = min(height[low], height[hight])
                    //w = diff between index => high - low
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
            if(height[low] < height[high]){                
                low++;
            }
            else
            {
                high--;
            }
        }
    }
}


// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Brute force  approach
class Solution {
    public int maxArea(int[] height) {
        
int max =0;
        int n  = height.length;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n; j++){
                //Area = h * w
                // int area  = Math.min(height[i], height[j])  * (j-i);
                max = Math.max(max, Math.min(height[i], height[j])  * (j-i));
            }
        }
        return max;
        
    }
}