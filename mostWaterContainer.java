// TC : O(N)
// SC : O(1)

class Solution {
    public int mostWaterContainer(int[] height) {
        int i=0, j = height.length-1;
        int max_area = 0;
        int temp_area =0;
        
        while(i<j){
            if(height[i] <= height[j]){
                temp_area = (j-i) * (height[i]);
                max_area = Math.max( max_area, temp_area);
                i++;
            }
            else{
                temp_area = (j-i) *( height[j]);
                max_area = Math.max( max_area, temp_area);
                j--;
            }
        }
        return max_area;        
    }
}
