//Time Complexity : O(n) size of nums
//Space Complexity : O(1)
/*Approach
-sorting the array first
-taking two pointers for every position one just after it and one at the end of array
-so considering ith position low position and high we will sum it up nd if it turns out to be 0(target)
we will store it in result and increment low till it is distinct and decrement high till it is distinct
-if our sum is greater than 0 then we can decrement high since array is sorted
-if sum is less than 0 we can increment low since array is sorted and we want to get 0

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static List<List<Integer>> tSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2;i++)
        {
            if(i>0 && nums[i-1] == nums[i])continue;
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> current = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(current);
                    low++;
                    high--;
                    while(low<high && nums[low-1]==nums[low])low++;
                    while(low<high && nums[high+1]==nums[high])high--;
                }
                else if(sum > 0){
                    high--;
                }
                else{
                    low++;
                }
                        
            }
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println(tSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(tSum(new int[]{-5,3,2,-1, 0, 1, 2, -1, -4}));
    }
}