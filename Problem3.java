// Time complexity: O(N/2) where N is the length of the heights array
// Space complexity: O(1)
// Does it run on Leetcode: yes



class Problem3 {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
            return 0;

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right){
          // output = length x minimum of the two heights
            max = Math.max(max, Math.min(height[left], height[right]) * ((right+1) - (left+1)));
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}