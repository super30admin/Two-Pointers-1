// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : faced an issue while comparing previous element to current element to inc/dec pointers.


// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums == null || nums.length <= 2) return result;
        
        Arrays.sort(nums);
        
        // Selecting the first element as pivot.
        for(int i = 0; i < nums.length-2; i++){
            
            // If the current pivot element is same as the previous one, then skip it.
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            
            // Setting the next element to pivot for low pointer
            int j = i + 1;
            
            // Setting the high pointer to end of the array.
            int k = nums.length - 1;
            
            // explore all the possible triplets with the given pivot.
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                // if sum is 0, then we found the triplet.
                if(sum == 0){
                    
                    // Adding the current triplet to the result.
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    Collections.sort(triplet);
                    result.add(triplet);
                    j++; k--;
                    
                    // If the current low pointer element is same as the previous one, then skip it.
                    while(j < k && nums[j] == nums[j-1]) j++;
                    
                    // If the current high pointer element is same as the previous one, then skip it.
                    while(j < k && nums[k] == nums[k+1]) k--;
                
                // if sum is less than zero, then increment the low pointer to move the sum closer to zero
                } else if(sum < 0){
                    j++;
                
                // if sum is greater than zero, then decrement the high pointer to move the sum closer to zero
                } else{
                    k--;
                }
            }
        }
        return result;
    }

    public static void printNestedList(List<List<Integer>> list){
        System.out.print(" | ");
        for(List<Integer> arr: list){
            for(int num: arr){
                System.out.print(num+" ");
            }
            System.out.print(" | ");
        }
        System.out.println();
    } 

    public static void main(String[] args) {
        printNestedList(threeSum(new int[]{2,2,2,2,2,2}));
        printNestedList(threeSum(new int[]{-1,0,1,2,-1,-4}));
        printNestedList(threeSum(new int[]{0,0,0}));
        printNestedList(threeSum(new int[]{-2,0,1,1,2}));
    }
}
