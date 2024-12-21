/*
    Leetcode problem 15: 3Sum
    T.C: O(nlog(n)) - O(nlog(n)) + O(n * n) :: S.C: O(1)

    Solved using Two Pointers: We need to sort the nums Array first and then
    iterate over each element in the sorted array, by selecting left and right
    pointer to be i + 1 and n - 1 respectively. Now run a loop from left to right
    by checking if the sum of the three elements i, left & right is equal to 0; If
    so add this triplet to the result, and move i to next element. Avoid duplicates
    by comparing the ith element with the previous element. Same check need to be 
    done for left and right pointers. Replace 0 with k to find triplets that sum to k.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length <= 2) return result;

        int n = nums.length;

        Arrays.sort(nums);

        int i = 0;
        do {
            //Avoid duplicates by comparing previous ith element
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        List<Integer> triplets = Arrays.asList(nums[i], nums[left], nums[right]);

                        result.add(triplets);
                        left++; right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }

            }
            //If ith element is greater the 0 or k then we cannot find a triplet
            if (nums[i] > 0) break;
            i++;
        } while (i < n);

        return result;
    }
}