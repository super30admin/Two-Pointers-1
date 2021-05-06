import java.util.*;

// Your code here along with
class Sample {
    private static void swap(int[] nums, int i,  int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private static int[] sort_colors(int[] nums) {
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No

        int n = nums.length;
        int zerosPointer = 0;
        int onesPointer = 0;
        int twosPointer = n - 1;
        // until mid cross high
        while (onesPointer <= twosPointer) {
            if (nums[onesPointer] == 0) {
                // move zeros to left
                swap(nums, zerosPointer, onesPointer);
                zerosPointer += 1;
                onesPointer += 1;
            }else if (nums[onesPointer] == 2) {
                // twos to the right
                swap(nums, onesPointer, twosPointer);
                twosPointer -= 1;
            }else{
                // and leaves ones in the middle
                onesPointer += 1;
            }
        }
        return nums;
    }

    private static Set<List<Integer>> three_sum(int[] nums) {
        // Time Complexity : O(n^2)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No

        int n = nums.length;
        if (n < 3) {
            Set<List<Integer>> numSet = new HashSet<List<Integer>>();
            Integer[] numsArray = new Integer[n];
            Arrays.setAll(numsArray, i -> nums[i]);
            numSet.add(Arrays.asList(numsArray));
            return numSet;
        };

        HashSet<List<Integer>> triplets = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            int s;
            // for each number check for a doublet that makes the sum zero
            while (j < k) {
                s = nums[i] + nums[j] + nums[k];
                // move towards higher sum if negative
                if (s < 0) j++;
                // move towards lower sum if positive
                else if (s > 0) k--;
                else{
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return triplets;
    }

    private static int max_area(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            // move from the shorter wall as it defines the max area
            if (height[left] < height[right]) left++;
            else right--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Sorted colors: " + Arrays.toString(sort_colors(new int[] {2, 1, 2, 0, 1, 0, 1, 0})));
        System.out.println("Max area: " + max_area(new int[] {1,8,6,2,5,4,8,3,7})); // 49
        System.out.println("Three Sum: ");
        for(List<Integer> triplet: three_sum(new int[] {-1, 0, 1, 2, -1, -4})) {
            System.out.print(Arrays.toString(triplet.toArray(new Integer[0])) + ", ");
        }
    }
}