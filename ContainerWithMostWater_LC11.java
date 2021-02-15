//Time: O(n) optimal , O(n^2) for brute force
//space: o(1) no extra space

class Solution {
    public int maxArea(int[] height) {
        
        int ans = 0;
        int n = height.length;
        
        //brute force
//         for(int i = 0; i < n - 1; i++){
            
//             for(int j = i+1; j < n; j++){
//                 int min = Math.min(height[i], height[j]);
//                 ans = Math.max(ans, (min * (j - i)));
//             }
//         }
        
        //optimal
        
        int left = 0;
        int right = n - 1;
        
        while (left < right){
            int min = Math.min(height[left], height[right]);
            ans = Math.max(ans, (min * (right - left)));
            if(height[left] < height[right])
                left++;
            else
                right--;
        }n
        
        
        return ans;
        
    }
}