import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /*
     * Time - O(n^2)
     * Space - O(1)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<n-2; i++) {
            int l=i+1, h=n-1;
            // Remove outer duplicates
            if (i!=0 && nums[i]==nums[i-1])
                continue;
            while (l<h) {
                int sum = nums[i]+nums[l]+nums[h];
                if (sum==0) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[l], nums[h]);
                    res.add(temp);
                    l++;h--;
                    // Remove inner duplicates by running a while loop and skipping duplicates
                    while (l<h && nums[l] == nums[l-1]) l++;
                    while (l<h && nums[h] == nums[h+1]) h--;
                } 
                else if (sum>0) {
                    // no need to run while loop here since triplet is already not found
                    // so dont have to worry about duplicates with another same element.
                    h--;
                } 
                else {
                    // no need to run while loop here since triplet is already not found
                    // so dont have to worry about duplicates with another same element.
                    l++;
                }
            }
        }
        return res;
    }
}