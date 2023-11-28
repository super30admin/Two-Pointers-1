// Time Complexity :O(2nlog n) ==> O(nlog n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes https://leetcode.com/problems/3sum/
// Any problem you faced while coding this :
import java.util.*;

//Sol: As the numbers are +ve and -ves and sum has to be 0, we can sort the array to have -ve at left and +ve at right
//Iterate through the array by maintaining 2 pointers left and right and check if sum = 0 between i, left and right
//If sum is 0, store result in set of lists.
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        //Step1 : sort the array, then getting a sum of zero is predictable on number line
        Arrays.sort(nums);//O(nlog n)

        //As there shouldn't be duplicate pairs, create a set of list pairs'
        Set<List<Integer>> res = new HashSet<>();

        //Use 2 pointer method, n1 = start index, n2 = end index, i = current iteration
        //As we already have 2 pointers, for loop needs to run length - 2 times
        for(int i=0; i< nums.length -2; i++) {//O(n)
            int n1 = i + 1;
            int n2 = nums.length -1 ;
            //loop until n1 and n2 cover all nums from left and right
            while(n1< n2) {
                int sum = nums[i] + nums[n1] + nums[n2];

                //if sum is 0, that's our pair, need to store in list
                if(sum == 0) {
                    ArrayList<Integer> sp = new ArrayList<>();
                    sp.add(nums[i]);
                    sp.add(nums[n1]);
                    sp.add(nums[n2]);

                    res.add(sp);

                    //Go ahead for second pair
                    n1++;
                }
                //sum < 0, means we are far towards negative, so n1 ++
                else if(sum < 0){
                    n1++;
                }
                else {
                    n2--;
                }
            }

        }
        return new ArrayList<>(res);
    }
}
