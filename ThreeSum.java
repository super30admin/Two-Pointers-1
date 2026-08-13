import java.util.*;

//Approach: We need to fix one element in the array while search for other two elements within the right part of the array (using two pointers) that makes the overall sum as 0,
// where we copy the elements to the result list. If not, we move the left and right pointers accordingly. We continue this for all elements of the array thus making the
// time complexity  n power 2 for these iterations and nlogn for sorting the array.

//Time Complexity : O(n2) + n log(n)
//Space Complexity: O(1)
public class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();

        //Validate the inputs
        if (nums == null || nums.length == 0) return resultList;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){

            //Skip duplicate values
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) // Elements found and so copy to resultList and move the right and left pointers
                {
                    resultList.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Continue when we have the same numbers in the consecutive positions
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                } else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return resultList;
    }
}

