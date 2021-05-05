class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        
        while(low < high){  
            max = Math.max(max, (high - low) * Math.min(height[low], height[high]));
           
            if(height[low] < height[high]){
               //case 1
                low++;
            }else
                //case 2
                high--;
        }
        return max;
    }
}
