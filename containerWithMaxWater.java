// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n= height.length;
        int max = 0;
        int low = 0; int high = n - 1;
        while(low<high){
            max = Math.max(max, Math.min(height[low] , height[high])*(high-low));
            if(height[low] < height[high]){
                low++;
            } else{
                high--;
            }
        }
        return max;
    }
}

/* recursive solution
class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n= height.length;
        int max = 0;
        for(int i = 0; i < n;i++){
            for(int j = i+1; j<n; j++){
                max = Math.max(max, Math.min(height[i] , height[j])*(j-1));
            }
        }
        return max;
    }
}
*/