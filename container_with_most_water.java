class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)
        {
            return 0;
        }
        
        int low  =0;
        int high =height.length-1;
        
        int result = 0;
        int area =0;
        
        while(low<high)
        {
            area = (high-low)*Math.min(height[low], height[high]);
            
            if(area > result)
            {
                result = area;
            }
            
            if(height[low]>height[high])
            {
                high--;
            }
            else{
                low++;
            }
        }
        return result;
        
    }
}
