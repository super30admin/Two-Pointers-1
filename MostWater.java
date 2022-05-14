class Solution {

    // BF-  aread bound to min hight wall. calculate area for ach combination. - n^2
    // 2 pointer - one at start one at end. That way we will have max width and we will start calculating area and comapare local area with max.
    // Move pointers? small is limiting so move that of possibility of finding bigger.
    public int maxArea(int[] height) {
        int result = 0;
        int low = 0;
        int high = height.length - 1;

        while (low < high) {
            int currentArea = 1;

            if (height[low] <= height[high]) {
                currentArea = height[low] * (high - low);
                result = Math.max(result, currentArea);
                low++;
            } else {
                currentArea = height[high] * (high - low);
                result = Math.max(result, currentArea);
                high--;
            }
        }
        return result;
    }
}
