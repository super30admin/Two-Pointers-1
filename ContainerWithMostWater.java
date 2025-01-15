class Solution {
	//Time Complexity: O(n)
	//Space Complexity: O(1)
    public int maxArea(int[] height) {
        if (height == null || height.length ==0)    {
            return 0;
        }

        int l = 0, r = height.length-1;
        int res = 0;
        while (l<r){
            int vol = Math.min(height[l],height[r])* (r-l);
            res = Math.max (res,vol);

            if (height[l] < height[r]){
                l++;
            } else {
                r--;
            } 
        }
        return res;
    }
}
