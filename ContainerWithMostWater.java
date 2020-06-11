class Solution {
        // Time Complexity : O(length of heights ^ 2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Bruteforce
1. Get all the combinations of areas possible with heights.
2. Maintain local and global max at every iteration.
*/
    
    public int maxArea(int[] height) {
        
        if(height == null || height.length == 0) return 0;
        
        int max = 0;
        for(int i=0;i<height.length;i++){
            for(int j =0;j<height.length;j++){
                int area = (j-i)*(Math.min(height[i],height[j]));
                max = Math.max(max,area);
            }
        }
        
        return max;
        
    }
}



class Solution {
        // Time Complexity : O(length of heights)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
2 pointers
1. Maintain two pointers at start and end, increment and decrement respectively in search of more height.
2. Maintain local and global max at every iteration.
*/
    
    public int maxArea(int[] height) {
        
        if(height == null || height.length == 0) return 0;
        
        int max = 0;
        int low = 0; int high = height.length-1;
        while(low < high){
            int area = (high-low) * Math.min(height[low],height[high]);
            max = Math.max(area,max);
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
        
    }
}