class Solution {
    
    //time- O(N), Space- O(1)
    public int maxArea(int[] height) {
        
        
        //limiting factor= min(h1, h2) for maxArea
        
        //so i need to find max limiting factor to get max area
        
        //move the smaller one and keep track of area
        
        int area=0;
        
        int l=0, r=height.length;
        
        while(l<r){
            
            area= Math.max(area, Math.min(height[l], height[r-1])*(r-1-l));
            
            if(height[l]<height[r-1]){
                l++;
            }
            else r--;
        }
        
        return area;
        }
    
}