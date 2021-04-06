// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> allThreeSums = new HashSet<>();
        int LastIndex = nums.length - 2;

        for (int i = 0; i < LastIndex; i++) {
            findTwoSum(i, nums, allThreeSums);
        }

        return new ArrayList<>(allThreeSums);
    }

    private void findTwoSum(int rootIndex, int[] A, Set<List<Integer>> allThreeSums) {
        int left = rootIndex + 1;
        int right = A.length - 1;

        while (left < right) {
            int threeNumberSum = A[rootIndex] + A[left] + A[right];

            if (threeNumberSum == 0) {
                allThreeSums.add(Arrays.asList(A[rootIndex], A[left++], A[right--]));
            } else if (threeNumberSum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
}