/*

Time Complexity : O(n) : we travase the array only one time so n is the length of the array.

Space Complexity: O(1) : as we are not using any extra space

Leetcode : Worked on leetcode.


*/

public class Container {

    public int maxArea(int[] height) {
        // starting index

        int lo = 0;

        // ending index

        int hi = height.length - 1;
        // to store the max amount of water can container store.
        int max = 0;

        while (lo < hi) {

            // as we have to find max water storage. checking min. height and difference
            // between width.
            max = Math.max(max, (Math.min(height[lo], height[hi]) * (hi - lo)));

            // changing the poiner if we move who has small height we might be get big
            // number.

            if (height[lo] < height[hi]) {

                lo++;

            } else {

                hi--;
            }

        }

        return max;

    }
}
