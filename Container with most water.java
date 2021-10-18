// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//We want the area to be maximized so we start by taking 2 pointers at 2 ends aswidth will be max then
//now we move inwards by considering a max and calculating area at each index.. we want to maximize area so 
//we move inwards at that end (or pointer) which is smaller. we return the max at the end.


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length<2){
            return 0;
        }
        
        int max=0;
       
        
        int left=0;
        int right=height.length-1;
        
        while(left<right){
          max=Math.max(max, Math.min(height[left], height[right])*(right-left));
            
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}