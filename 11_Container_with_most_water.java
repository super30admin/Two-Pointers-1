class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int j = height.length - 1;
        int i = 0;
        while (j != i) {
            if (height[i] > height[j]) {
                max = Math.max((j - i) * height[j], max);
                j--;
            } else {
                max = Math.max((j - i) * height[i], max);
                i++;
            }
        }
        
        return max;
    }
}

//TC => O(n)
//SC => O(1)
