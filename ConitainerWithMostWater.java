//Time Complexity:O(N); N is length of array
//Space Complexity:O(1) no extra space
class Solution {
    public int maxArea(int[] height) {
        if(height== null || height.length == 0){
            return 0;
        }
        int max = 0;
        int high = height.length-1;
        int low = 0;

        while(low<high){
            int current = (high-low)*Math.min(height[low],height[high]);
            max= Math.max(max,current);

            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
}