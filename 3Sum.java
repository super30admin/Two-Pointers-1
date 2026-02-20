import java.util.*;

// Set O(n^2) + O(nlogn) time, O(n) space
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> ans = new HashSet<>();
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             int target = 0 - nums[i];
//             Set<Integer> set = new HashSet<>();

//             for (int j = i+1; j < n; j++) {
//                 int complement = target - nums[j];
//                 if (set.contains(complement)) {
//                     List<Integer> temp = Arrays.asList(nums[i], nums[j], complement);
//                     Collections.sort(temp);
//                     ans.add(temp);
//                 }
//                 set.add(nums[j]);
//             }
//         }
//         return new ArrayList<>(ans);
//     }
// }

// Two pointers O(n^2) + O(nlogn) time, O(1) space
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                continue; // skip duplicates
            }
            if (nums[i] > 0) break; // since we wont find triplet, array is sorted
            
            int left = i+1;
            int right = n-1;

            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];
                
                if (threeSum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
                else if (threeSum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return ans;
    }
}