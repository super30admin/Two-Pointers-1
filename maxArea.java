class Solution {
    public int maxArea(int[] height) {
        
        if(height == null || height.length < 2)  return 0;
        int n = height.length;
        int max = 0; int l =0; int h = n-1;
        
        /*
        //Brute force way
        for(int i =0;i< n;i++){
            for(int j =0;j<n;j++){
                max = Math.max(max, (j-i) * Math.min(height[i],height[j]));
            }
        }
        return max;
        */
       
        while(l<h){
            
            max = Math.max(max, Math.min(height[l],height[h])*(h-l));
            
            if(height[h]>height[l]){
                l++;
            }else{
                h--;
            }
        }
        
        return max;
        
    }
}