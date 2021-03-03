class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0 || height == null)
            return 0;
        int low=0, high=height.length-1, max=0;
        while(low < high){
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
            if(height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}
// time - O(N)
//space - O(1)