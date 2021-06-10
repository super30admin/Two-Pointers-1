package TwoPointers1;

import java.util.*;

public class question35_threeSum {

    /*
    Brute Force:
        Time Complexity: O(n ^ 3)
        Space Complexity: O(n)
    */

    private static List<List<Integer>> threeSumBruteForce(int[] nums) {

        if(nums == null || nums.length == 0) return new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i < n - 2 ; i ++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    /*
    Two Pointer:
        Time Complexity: O(n ^ 2)
        Space Complexity: O(1)
    */
    private static List<List<Integer>> threeSumTwoPointer(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3) return result;
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0 ; i < n ; i++) {
            //check the outside duplicacy
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i] > 0) break;
            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;

                    // check the inside duplicacy
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSumBruteForce(nums);

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println(" ");

        List<List<Integer>> list1 = threeSumTwoPointer(nums);
        for(int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
        }
    }
}