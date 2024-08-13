/**
 * we first sort the array
 * then we iterate over the array to get 1st part
 * then we find the rest using two pointer.
 * Three Sum problem using 2 pointer solution
 * Time complexity = O(n^2)
 * Space complexity = O(1)
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);// sort the array
        for(int i=0;i< nums.length-2;i++) {
            if(i>0 && nums[i]== nums[i-1]) {// number is same.
                continue;
            }
            if(nums[i]>0) {// don't care if the first number is greater than 0, we will never get a solution since we cannot even get -ve numbers after 0.
                break;
            }
            int low = i+1;
            int high = nums.length-1;
            while(low<high) {
                int sum= nums[i] + nums[low] + nums[high];
                if(sum== 0) {
                    // success.
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    res.add(list);
                    low++;
                    high--;
                    while(low< high && nums[low] == nums[low-1]) {
                        // the previous number and the current number is same.
                        low++;
                    }
                    while(low< high && nums[high] == nums[high+1]) {
                        // the previous number and the current number is same.
                        high--;
                    }
                }
                else if(sum >0) {
                    // sum is bigger. take a lower number.
                    high--;
                } else {
                    // sum is smaller. take a higher number.
                    low++;
                }
            }
        }
        return res;
        
    }
}