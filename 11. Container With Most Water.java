class Solution {// time and space constant
    public int maxArea(int[] height) {
        // base case
        if(height== null || height.length == 0)
            return 0;
        int result = Integer.MIN_VALUE ;
        int left = 0 ;
        int right = height.length - 1;
        
        //we are not just checking for one bar so left < right
        while(left < right){
            result = Math.max(result, Math.min(height[left], height[right])* (right-left));
            if(height[left]< height[right])
                left++;
            else
                right--;
        }
        return result ;
    }
}