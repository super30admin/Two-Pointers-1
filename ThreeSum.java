import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class ThreeSum {

    // Time Complexity : 0(n^2) where n is the no. of elements in the array
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: I iterated a loop to point to the 1st element and set a left
    //and right pointer which points to the 2nd element and the last element respectively. I then compare the sum of i,left and
    //right and check if the sum is qual to the target or not. If it is, then I increment the left pointer and decrement the
    //right pointer. If the sum is less than 0, then I will need to increment my left pointer as the array is sorted and a higher
    //no. will contibute towards the target and if the target is more than 0 , then I decrement my right pointer. I take care
    //of duplicate entries by placing while loops inside my sum == target condition as the left and right pointer will skip
    //the element if it has already come across it.

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int right = nums.length - 1;
            int left = i+1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left ++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right --;
                    }
                }
                else if(sum < 0){
                    left ++;
                }
                else{
                    right --;
                }
            }
        }
        return result;
    }
}