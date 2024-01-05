// Time complexity : o(n)
// Space complexity: o(1)
class Problem3 {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int max = 0;
        while(l<r){
            int currArea = (r-l)*Math.min(height[l], height[r]);
            max = Math.max(currArea, max);
            if(height[l]<height[r]){
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
