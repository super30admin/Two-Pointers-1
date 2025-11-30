// Approach 3: Two pointers + mid pointer
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, coded the brute force and failed two pointer solutions initially. Later, refered Dutch National Flag problem on YouTube.
 
/*
 * Initialized start and mid at 0 and end at last index.
 * Initially increase start and mid pointers until those are not pointing to 0
 * and decrease end pointer until it is not pointing to 2.
 * If mid is pointing to:
 *  - 0 then swap it with start and increment start
 *  - 2 then swap it with end and decrement end
 *  - 1 continue with next iteration
 *  - keep incrementing mid for each iteration and stop when it crosses end pointer.
 */

class Solution3 {
    private static final int RED = 0;
    private static final int WHITE = 1;
    private static final int BLUE = 2;
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            while (mid <= end && nums[start] == RED) {
                start ++;
                mid ++;
            }
            while (mid <= end && nums[end] == BLUE) {
                end --;
            }
            if (mid <= end) {
                switch (nums[mid]) {
                    case RED: {
                        swap (nums, start, mid);
                        start ++;
                        mid ++;
                        break;
                    }
                    case WHITE: {
                        mid ++;
                        break;
                    }
                    case BLUE: {
                        swap (nums, mid, end);
                        end --;
                        break;
                    }
                }
            }
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}

// Approach 2: Two pointer - failed for [2,0,1,2,1,0,2] the output is [0,0,1,2,1,2,2] but it should be [0,0,1,1,2,2,2]
class Solution2 {
    private static final int RED = 0;
    private static final int WHITE = 1;
    private static final int BLUE = 2;
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 < p2) {
            if (nums[p1] == RED) {
                // already in sorted order
                p1 ++;
            } else if (nums[p2] == BLUE) {
                // already in sorted order
                p2 --;
            } else if (nums[p2] == RED) {
                swap(nums, p1, p2);
                // elements from first index to p1 are sorted
                p1 ++;
            } else if (nums[p1] == BLUE) {
                swap(nums, p1, p2);
                // elements from p2 to last index are sorted
                p2 --;
            } else {
                break;
            }
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}

// Approach 1: Calculate counts of each colors and iterate through the array to add values according to the counts.
// Time: N + N ~= O(N)
// Space: O(1)
class Solution1 {
    private static final int RED = 0;
    private static final int WHITE = 1;
    private static final int BLUE = 2;
    public void sortColors(int[] nums) {
        int countRed = 0;
        int countWhite = 0;
        int countBlue = 0;
        for (int i = 0; i < nums.length; i ++) {
            switch (nums[i]) {
                case RED: {
                    countRed ++;
                    break;
                }
                case WHITE: {
                    countWhite ++;
                    break;
                }
                case BLUE: {
                    countBlue ++;
                    break; 
                }
            }
        }
        int index = 0;
        while (index < nums.length && countRed -- > 0) {
            nums[index ++] = RED;
        }
        while (index < nums.length && countWhite -- > 0) {
            nums[index ++] = WHITE;
        }
        while (index < nums.length && countBlue -- > 0) {
            nums[index ++] = BLUE;
        }
    }
}