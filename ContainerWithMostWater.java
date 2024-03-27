class Solution {
    /**
        2 Pointers Approach
        TC -> O(N) - where N is the length of height
        SC -> O(1) - 2 Pointers, constant
     */
    public int maxArea(int[] height) {
        if(height == null || height.length < 2) return -1;
        int res = 0;
        int left = 0, right = height.length - 1;

        while(left < right){
            // Curr Volume = width * height
            int volume = (right - left) * Math.min(height[left] , height[right]);

            // Max volume = Max(prev volume, curr volume)
            res = Math.max(res, volume);

            //Move the smaller height
            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return res;
    }
}
