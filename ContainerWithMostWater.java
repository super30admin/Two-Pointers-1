
//TC: O(N)
//SC:O(1)

class Solution {
    public int maxArea(int[] heights) {
        
        if(heights == null || heights.length == 0)
            return 0;
        
        int low  = 0;
        int high = heights.length-1;
        int max = Integer.MIN_VALUE;
        
        while(low < high){
           //CALC CONTAINER AREA AND SWAP WITH MAX IS LARGER THAN STORED
            max = Math.max(max, Math.min(heights[high],heights[low])*(high-low));
           
            //INCREMENT LOW IF LESS THAN HIGH 
            if(heights[low] < heights[high]){
                low++;
            }else{
                high--;
            }
            
        }
        
        return max;
        
    }
}