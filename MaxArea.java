class MaxArea {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        for(int i = 0, j = height.length - 1; i < j; ) {

            if(height [i] > height[j]) {
                max = Math.max(max,(j - i) * height[j]);
                j--;
            }
            else {
                max = Math.max(max, (j - i) * height[i]);
                i++;
            }

        }
        return max;
    }
}