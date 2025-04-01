// Time Complexity : O(n^2)
// Space Complexity : O(log n)  -> amortized space complexity for built-in Java Arrays.sort due to dual-pivot quick sort algo.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach - Sort the array. Iterate over the array, and for each num[i], use two-pointer approach to find two numbers
//    that sum up to -nums[i]. Skip duplicates by checking adjacent elements. This yields all unique triplets that sum to 0.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  //sorting array
        List<List<Integer>> res = new ArrayList<>();   //list to store ans

        for(int i = 0; i < nums.length-2; i++) {    //use 2 pointers, so loop 2 less
            if(i == 0 || (i>0 && nums[i]!=nums[i-1])) { //if 1st element or different element
                int low = i+1;  //intialise low ptr
                int high = nums.length-1;   //intialise high ptr
                int sum = 0 - nums[i];  //calculate target sum for other 2
                while(low < high) { //loop till low<high
                    if(nums[low] + nums[high] == sum) { //if 2 no.s found
                        res.add(Arrays.asList(nums[i], nums[low], nums[high])); //add to ans
                        while(low < high && nums[low]==nums[low+1]) low++;  //skip duplicates near low side
                        while(low < high && nums[high]==nums[high-1])   high--;   //skip duplicates near high side
                        low++;  //increment low
                        high--; //decrement high
                    } else if(nums[low] + nums[high] > sum) {   //if sum of low and high no.s greater than target
                        high--; //decrement high
                    } else {
                        low++;  //else increment low
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ThreeSum solver = new ThreeSum();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Input: " + Arrays.toString(nums1));
        List<List<Integer>> result1 = solver.threeSum(nums1);
        System.out.println("Triplets that sum to 0: " + result1);

        int[] nums2 = {0, 0, 0, 0};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        List<List<Integer>> result2 = solver.threeSum(nums2);
        System.out.println("Triplets that sum to 0: " + result2);
    }
}
