import java.util.Arrays;

// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, but I think it is not optimised solution

// Approach: 
// Sort the array. 
// Iterate each element upto length-2 and for each item have two pointers: j, pointing to next element of i & k, pointing to last element of array
// While j and k doesnt cross eachother, calculate the sum of the elements present at indices i,j,k.
// If sum=0, then we found the triplets. Since we are using HashSet, it will take care of duplicates.
// If sum>0, we need to try decreasing the sum val and so we decrement k as the array is sorted.
// In the same way, if sum<0, then we will increment j to increase the value.
// Finally, we will convert the result to arraylist and return it



// Your code here along with comments explaining your approach
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>(); // to avopid duplicates
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            int j=i+1;
            int k=nums.length-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++; k--;
                } else if(sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}