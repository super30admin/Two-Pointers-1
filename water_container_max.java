class Solution {
    public int maxArea(int[] height) {
        
        int i=0, j=height.length-1;
        int max=0;
        while(i!=j){
            
            System.out.println();
            if(max< Math.min(height[i],height[j])*(j-1)){
                max=Math.min(height[i],height[j])*(j-1);
            }
            if(height[i]<height[j]){
                i++;
            }else if(height[i]>height[j]){
                j--;
            }
            
            
        }
        return max;
    }
}
