//Time complexity: O(n)
//Space complexity: O(1)


class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0) return 0;
        int low=0;
        int high=height.length-1;
        int max=0;
        int small;
        while(low<high){
            small=Math.min(height[low],height[high]);
            max=Math.max(max,small*(high-low));
            if(height[low]==small){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}