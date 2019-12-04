// Time Complexity : o(n^2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
//not the optimal solution. will update to o(n)

//calculating the area for each bar with each bar given in the array




class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++)
                for(int j=i+1;j<height.length;j++)
                    max= Math.max(max, Math.min(height[i],height[j])*(j-i));
            return max;
        
        
    }
}