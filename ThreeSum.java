// Time Complexity : O(N) Three Pointer Approach
// Space Complexity : O(1) No extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        if(nums.length < 3 || nums == null){
            return(new ArrayList<>());
        }

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2;){

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){

                    List<Integer> subanswer = new ArrayList<>();
                    subanswer.add(nums[i]);
                    subanswer.add(nums[left]);
                    subanswer.add(nums[right]);

                    answer.add(subanswer);

                    int leftElement = nums[left]; // skipping over the similar elements

                    while(left < nums.length - 1 && leftElement == nums[left]){
                        left++;
                    }

                    int rightElement = nums[right]; // skipping over the similar elements

                    while(right >= 0 && rightElement == nums[right]){
                        right--;
                    }

                }else if(sum < 0){

                    int leftElement = nums[left]; // skipping over the similar elements

                    while(left < nums.length - 1 && leftElement == nums[left]){
                        left++;
                    }

                }else{

                    int rightElement = nums[right]; // skipping over the similar elements

                    while(right >= 0 && rightElement == nums[right]){
                        right--;
                    }

                }
            }

            int iElement = nums[i];

            while(i < nums.length && iElement == nums[i]){
                i++;
            }

        }

        return answer;
    }
}
