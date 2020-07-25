class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int low = 0;
        int high = height.length - 1;
        while(low < high){
            int area = Math.min(height[low], height[high]) * (high - low);
            res = Math.max(res, area);
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return res;
    }
}
