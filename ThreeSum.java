// Time Complexity : o(n*n)
// Space Complexity : O(1) as no auxiliary space used
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length < 1){
            return new ArrayList<>();
        }
        Arrays.sort(nums); //nlogn
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        int idx = 0, left, right = n-1;

        while(idx < n){
            if(nums[idx] > 0){
                break;
            }

            left = idx+1;
            right = n-1;
            int current = nums[idx];
            int complement = 0 - current;

            while(right >=0 && left < n && left < right){
                int currentSum = nums[left] + nums[right];
                if(currentSum > complement){
                    right--;
                }else if(currentSum < complement){
                    left++;
                }else{
                    //add to the result
                    List<Integer> triplet = new ArrayList<>();
                    int currentLeft = nums[left];
                    int currentRight = nums[right];

                    triplet.add(nums[idx]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    result.add(triplet);

                    left++; right--;

                    while(left < n && nums[left] == currentLeft){
                        left++;
                    }
                    while(right >= 0 && nums[right] == currentRight){
                        right--;
                    }
                    if(current == 0){
                        break;
                    }
                }
            }

            idx++;
            while(idx < n && nums[idx] == current){
                idx++;
            }
        }
        return result;

    }
}

