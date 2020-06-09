// Time Complexity :0(n2) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length==0)return 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<height.length;i++){
            for(int j = (height.length-1);j>i;j--){
                if(height[i]>height[j]){
                    int value = height[j]*(j-i);
                    if(max<value){
                        max = value;
                    }
                }else{
                    int value = height[i]*(j-i);
                    if(max<value){
                        max = value;
                    }
                }
            }
        }return max;
    }
}