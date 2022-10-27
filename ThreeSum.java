package s30.arrays.twoPointers;


// Time Complexity :: O(n^2 + nlogn) >> O(n^2); n^2 for the loop and nlogn for sorting
// Space Complexity :: O(1);
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);


        int a = 0;

        List<List<Integer>> res = new ArrayList();

        while(a < nums.length){

            int l =a+1;
            int r = nums.length -1;


            while( l < r){

                int threeSum = nums[l] + nums[r] + nums[a];

                if(threeSum ==0) res.add(Arrays.asList(nums[a],nums[l], nums[r]));

                if(threeSum > 0){
                    r--;
                    // iterate until we traverse equal elements
                    while(l < r && r != nums.length -1 &&  nums[r]== nums[r+1]){
                        r--;
                    }
                }

                else {
                    l++;
                    // iterate until we traverse equal elements
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }

            }

            a++;

            while(a!=0 && a < nums.length &&  nums[a] == nums[a-1]){
                a++;
            }
        }

        return res;

    }
    public static void main(String[] args) {

    }
}
