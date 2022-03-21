// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, need to make sure the 3 pointers end at nums.length - 3, nums.length - 2 and nums.length -1


// Your code here along with comments explaining your approach
/* APPROACH:
Using the two pointers approach of 2-sum and applying it for the 3rd pointer
Using the 3 pointers approach :
1st pointer would iterate through the outer loop, do check for the outer duplicates
to run the 2 pointers inside the while loop, take 2 pointers, start and end.
set start as outer loop pointer + 1 and end as array length - 1
1. if(start + end) > effective target == target-outer pointer value, end--
2. else if(start + end) < effective target == target-outer pointer value, start++
3. else, start++, end-- and add the tuple in the list as a list itself
NOTE: Keep on checking for duplicates by incrementing the pointer until a new unique value is found, but making sure start remains less than end.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            // check for outside duplicacy
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int low = i+1; int high = nums.length - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> temp = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(temp);
                    high--;
                    low++;
                    // check for inside duplicacy
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;
                }
                else if (sum > 0) high--;
                else low++;
            }
        }
        return result;

        // Brute Force
        /* List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<nums.length-2; i++){ // till 3rd last position
            for(int j = i+1; j<nums.length-1; j++){ // till 2nd last position
                for(int k = j+1; k<nums.length; k++){ // till last position
                    if(nums[i] + nums[k] + nums[j] == 0){
                        List<Integer> temp = Arrays.asList(nums[i],nums[k],nums[j]);
                        Collections.sort(temp);
                        if(!set.contains(temp)){
                            set.add(temp);
                            result.add(temp);
                        }
                    }
                }
            }
        }
        return result;
        */
    }

    public static void main(String[] args){
        int[] nums1 = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums1)); //[[-1,-1,2],[-1,0,1]]

        int[] nums2 = {};
        System.out.println(threeSum(nums2)); //[]

        int[] nums3 = {0};
        System.out.println(threeSum(nums2)); //[]
    }
}
