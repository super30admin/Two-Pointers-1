class Solution {
    //Time complexity: O(n)
    //Space complexity: O(1)
    public int maxArea(int[] height) {
        int l=0,h=height.length-1;
        int m=0;
        while(l<h){
            m=Math.max(m,Math.min(height[l],height[h])*(h-l));
            if(height[l]<=height[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return m;
    }
}