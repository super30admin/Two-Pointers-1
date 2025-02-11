class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int n= height.length;
        int area=0;
        int i=0;
        int j=n-1;
        while(i<j){
            area= Math.min(height[i],height[j])*(j-i);
            max=Math.max(max,area);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return max;
    }
}