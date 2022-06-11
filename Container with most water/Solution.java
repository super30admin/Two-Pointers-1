// TIme complexity: O(n)
// Space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int breadth=height.length-1;
        int l=0,r=height.length-1;
        int max=0;
        while(l<r){
            int temp= Math.min(height[l],height[r]);
            if(temp*breadth > max) max=temp*breadth;
            if(height[l]<height[r]) l++;
            else r--;
            breadth--;
        }
        return max;
    }
}
