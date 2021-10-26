// 11 Container with Most water
// solved on leetcode
// Time complexity - O(n)
// Space complexity - O(1)
class Solution {
    public int maxArea(int[] height) {
        
        int first=0;
        int last=height.length-1;
        int result_area=0;
        int current_area=0;
        
        while(first<last){
            // calculating the area at that perticular instance    
            current_area= (last-first) * Math.min(height[first],height[last]) ;
            if(height[last]>height[first]){
                first++;
            }else{
                last--;
            }
            // checking for max area
            if(result_area < current_area){
                result_area=current_area;
            }
        }
        
        return result_area;
        
    }
}