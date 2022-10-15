//Time Complexity :   O (N) 
//Space Complexity :  O (1) 
//Did this code successfully run on Leetcode :    Yes
class WaterMaxArea {
    public int maxArea(int[] height) {
        int max=0;
        int low=0;
        int high=height.length-1;
        
        while(low<high){
            int area=Math.min(height[low],height[high]) * Math.abs(high-low);
            max=Math.max(max,area);
            
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}