// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        // return helperBruteForce(height, n);

        return helperTwoPtr(height, n);
    }

    private int helperTwoPtr(int[] height, int n) {
        //space to hold max, and left and right
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            //Compare left and right ptr and use the min of them for length
            int length = Math.min(height[l], height[r]);
            // diff btwn left and right is the breadth
            int breadth = r - l;
            //max area
            max = Math.max(max, (length * breadth));

            //if height[right] < height[left] and decrease the right ptr or else increment left ptr
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }

        return max;
    }

    // private int helperBruteForce(int[] height, int n) {
    //     int max = Integer.MIN_VALUE;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             int length = Math.min(height[i], height[j]);
    //             int breadth = j - i;
    //             max = Math.max(max, (length * breadth));
    //         }
    //     }

    //     return max;
    // }
}