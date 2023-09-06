class MostArea {
    public int maxArea(int[] height) {
        //TC: O(N), SC:O(1)
        int maxArea = 0;
        int n = height.length;
        int low = 0;
        int high = n-1;
        while(low < high) {
            maxArea = Math.max(maxArea, Math.min(height[low], height[high]) * (high-low));
            if(height[low] <= height[high]) low++;
            else high--;
        }
        return maxArea;
    }
}

// TC: O(n^2) TIme limit ex ceeded
// int maxarea = 0;
//         for (int left = 0; left < height.length; left++) {
//             for (int right = left + 1; right < height.length; right++) {
//                 int width = right - left ;
//                 maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
//             }
//         }
//         return maxarea;