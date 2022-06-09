// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Main {
    public static int maxArea(int[] height) {

        // we are using two pointer approch to solve this problem
        int l = 0;
        int r = height.length - 1;

        // intialize max area with 0
        int maxArea = 0;
        // traverse through l<=r
        while (l <= r) {
            // maximum area for current left and right pointer will be maximum of current
            // and previous maximum
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));

            // if left pointer height is less than right pointer height so we will be
            // increase left pointer by one becauese here it is worthless if we move our
            // right pointer as it will still give maxarea less then current.
            if (height[l] < height[r]) {
                l++;
            } else {
                // else we decrease right pointer
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("maximum water can be stored is: " + maxArea(height));
    }
}