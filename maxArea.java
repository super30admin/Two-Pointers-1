class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int p1 =0;
        int p2 =n-1;
        int max= 0;
        
        
        while(p1<p2){
            
            if(height[p1]<height[p2]){
                max = Math.max(max,area(height,p1,p2));
                p1++;
            }
            else{
                max = Math.max(max,area(height,p1,p2));
                p2--;
            }
        }
        
        return max;
    }
    
    private int area (int[] height ,int p1, int p2){
        int res = Math.min(height[p1],height[p2])*(p2-p1);
        
        return res;
    }
}