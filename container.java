// Time Complexity :  O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : understood from the class


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        
        if(height==null || height.length==0){return 0;}
        int max=0; 
        int left=0;
        int right= height.length-1;
        
        while(left<right){
            max=Math.max(max, (right-left)*Math.min(height[left], height[right]));
            if(height[left]<height[right]){left+=1;}
            else{right-=1;}
        } return max;
        
    }
}