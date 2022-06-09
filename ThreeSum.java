import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity: O(n^2 + nlogn) = O(n^2)
// Space COmplexity: O(1)

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        // Sort the array
        Arrays.sort(nums);
        // Fix one element and find the other two numbers using two pointers to check if a triplet exisit which has a sum == 0
        for(int i=0; i <nums.length; i++){
            int start = i + 1;
            int end = nums.length -1;
            // If i and i-1 element is same then we dont have to check its triplet
            if(i==0 || nums[i-1] != nums[i])
                helper(nums, nums[i], start, end, result);
        }
        return result;
    }

    private void helper(int[] nums, int num, int start, int end, List<List<Integer>> result) {
        while(start < end){
            int sum = num + nums[start] + nums[end];

            if(sum == 0){
                // Store the triplet in result
                result.add(Arrays.asList(num, nums[start], nums[end]));

                // If start and its Start + 1 are same then increment start else it may cause duplicate triplet
                while(start < end && nums[start] == nums[start + 1]) start++;
                // If end and end - 1 are same then decement end else it may cause duplicate triplet
                while(start < end && nums[end] == nums[end - 1]) end--;

            }
            // if sum is less than zero then increment start so that the total sum increases
            else if(sum < 0) start++;
            // if sum is more than zero then decrement end so that the total sum decreases
            else end--;
        }
    }


}
