class Solution {
    public int maxArea(int[] height) {

        //Had some trouble implementing will update
        int p1 = 0;
        int p2 = height.length - 1;
        int max = 0;

        for (int i=0; i<height.length; i++) {
            Math.max(height[p1] - height[p2]);
        }

    }
}