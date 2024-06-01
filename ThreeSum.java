import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 *TC - O(n^2), SC - O(1)
 */
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        //Using 3 pointers- i, left, right

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;


        //Sort the array
        Arrays.sort(nums);

        for(int i=0; i<n; i++) {
            int left =i+1, right = n-1;

            //skip the same element for 1st position
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    //add this triplet to result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //Increment left pointer
                    left++;

                    //Skip the same element for 2nd position
                    while(left < right && nums[left] == nums[left -1]) {
                        left++;
                    }
                }

                else if(sum > 0) {
                    //Need smaller element, decrement right pointer
                    right--;
                }

                else {
                    //Need larger element, increment left pointer
                    left++;
                }
            }
        }

        return result;
    }
}