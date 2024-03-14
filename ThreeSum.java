import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
//tc = o(n2)
//sc = 0(n) hashset
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int low = i+1;
            int high = n-1; //this should be n-1 not n
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low ++;
                }
                else if(sum < 0){
                    low ++;
                }
                else if(sum > 0){
                    high--;
                }
            }
        }
        return new ArrayList<>(set); //did not remember the syntax
    }
}