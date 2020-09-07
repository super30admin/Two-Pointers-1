import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n^2 * n log n) = O(n^2), n= length of array nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Problem_2 {
	
public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> li = new ArrayList<>();
        for(int i = 0; i <nums.length - 2; i++){
            int a = i, b = a + 1, c = nums.length - 1;
            if(nums[a] > 0) break;
            if(a != 0 && nums[a] == nums[a-1]) {
            	continue;
            }
            while( b < c){
                int sum = nums[a] + nums[b] + nums[c];
                if(sum == 0){
                    li.add(new ArrayList<>(Arrays.asList(nums[a] , nums[b] , nums[c])));
                    b++;
                    while(b < c && nums[b] == nums[b-1])  b++;
                    c--;
                    while(b < c && nums[c] == nums[c+1]) c--;
                }
                else if(sum > 0){
                    c--;
                    while(b < c && nums[c] == nums[c+1]) c--;
                }else{
                    b++;
                    while(b < c &&nums[b] == nums[b-1]) b++;
                }
            }
        }
        return li;
    
    }
}
