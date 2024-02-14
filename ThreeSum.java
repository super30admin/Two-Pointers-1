//https://leetcode.com/problems/3sum/

// Time Complexity = O(nlogn + n^2)
// Space Complexity = O(1) //HashSet // I took list and pair to test on local. In problem it has not been asked.
// Does it run on LeetCode successfully? = Yes
// Any difficulties: Not for this. Just learning mechanics at first place was.
/*

Fix outside number, iterate over inside and find 2 numbers which sums up with outside number as 0.
That is triplet.

In 3 Sum, Between Hashing and Two Pointers for 3 Sum, 2 pointer is better as it saves space.
Hashing: O(n^2) and O(n)
Two Pointers : O(n2) and O(1)
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); //O(nlong): Merge Sort
        for(int i=0; i<n; i++){ //O(n)
            if(i != 0 && nums[i] == nums[i-1])
                continue; //Handles outside duplicacy by skipping the number

            //Optimization
            if(nums[i] > 0) break; //As target is 0 in this example. There is no point of going as Array is sorted.

            int low = i+1;
            int high = n-1;
            while(low<high) { //O(n)
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[low],nums[high]));
                    low++;
                    high--;

                    //These conditions remain inside as we have sorted the array.
                    while(low<high && nums[low] == nums[low-1]) //Why do I need to check that condition again
                        low++;

                    while(low<high && nums[high] == nums[high+1])
                        high--;
                }else if(sum > 0){ //here target is 0 so checking with 0 explicitly
                    high--;
                }else{
                    low++;
                }
            }
        }
        return results;
    }

    public static void main(String[] args){
        ThreeSum obj = new ThreeSum();
//        obj.threeSum(new int[]{-1,0,1,2,-1,-4});
        obj.threeSum(new int[]{-2,0,1,1,2});

    }
}