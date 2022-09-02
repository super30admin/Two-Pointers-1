//TC: O(n)
//SC: O(1)
//Program ran on leetcode
class MaxArea {
    public int maxArea(int[] height) {
        
        int l = 0; 
        int h = height.length - 1;
        int max = 0;
        
        while (l <= h){
            int area = 0;
            if (l == h){
               if (l == 0){
                   area = Math.min(height[l], height[l+1]);
               }else if (l == height.length - 1){
                   area = Math.min(height[l], height[l-1]);
               }else{
                   area = Math.max(Math.min(height[l], height[l-1]), Math.min(height[l], height[l+1]));
               }
            }else{
              area = Math.min(height[l], height[h]) * (h - l);  
            }
            if (area > max){
                max = area;
            }
            if (height[l] <= height[h]){
                l++;
            }else{
                h--;
            }
        }
        
        return max;
        
    }
}
