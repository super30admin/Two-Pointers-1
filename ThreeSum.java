// Time Complexity: Time complexity for sorting O(n logn) and for two pointers is O(n^2). So overall time complexity is O(n^2)
// Space Complexity : O(n)
// Ran on Leetcode : Yes
// Any problem s encountered: No


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>>threeSum(int [] nums){
        List<List<Integer>> result = new ArrayList<>(); // store the result in an array list
        Arrays.sort(nums);

        for (int i =0; i<nums.length - 2; i++){ // Fix the current pointer
           if(i >0 && nums[i] == nums[i-1]) continue; // Skip duplicate elements
           int left = i + 1; // start the left pointer from next pointer to current pointer
           int right = nums.length - 1; // start the right pointer from the last element in an array

           while (left < right ){
               int sum = nums[left] + nums[right] + nums[i];

               if(sum == 0){
                   result.add(Arrays.asList(nums[i], nums[left], nums[right])); // Convert into list

                   while(left < right && nums[left] == nums[left + 1]) left++; // skip the duplicate elements for second and third elements
                   while(left < right && nums[right] == nums[right - 1]) right--;
                   // move the pointers to the next elements after finding the valid triplet
                   left++;
                   right--;
               }else if(sum < 0){
                   left++; // move the left pointer to increase the sum
               }else{
                   right--; // move the right pointer to decrease the sum
               }

           }
        }
        return result;

    }
 public static void main (String[] args){
     ThreeSum solution= new ThreeSum();
     int [] nums = {-1, 0, 1, 2, -1, -4};
     System.out.println(solution.threeSum(nums));



 }


}
