// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Sort the array to make it easier to avoid duplicates and apply two-pointer technique.
// Fix one element (nums[i]) and use two pointers (left and right) to find the remaining two numbers that sum to zero.
// Skip duplicate elements to avoid duplicate triplets in the result.
// Adjust pointers based on whether the sum is less than or greater than zero.






import java.util.*;


public class ThreeSum {
    public List<List<Integer>> solve(int[] nums) {
        if(nums==null || nums.length < 3){
            return new ArrayList<>();

        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right]==nums[right+1]){
                        right--;
                    }

                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return res;
        
    }
    public static void main(String[]args){
        ThreeSum ob = new ThreeSum();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 1, 1};
        System.out.println("Triplets are: "+ob.solve(nums1));
        System.out.println("Tripets are: "+ob.solve(nums2));
        
    }
    
}
