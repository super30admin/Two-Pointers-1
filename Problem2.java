import java.util.*;
// Time Complexity :O(nlogn) + O(n^2) = O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
public class Problem2 {
    //Approach is to use 2 pointer at each index
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        int n = nums.length;
        //sort the array first so we can do pointers approach;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            //if the i index is equal to last index value , so to avoid duplicate skip it
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            //if i value becomes greater than 0 as in sorted array the next values would be greater so no fun of going further
            if(nums[i] > 0){
                break;
            }
            int leftPtr = i+1;
            int rightPtr = n-1;

            while(leftPtr < rightPtr){
                int sum =  nums[i] + nums[leftPtr] + nums[rightPtr];
                //there are only 3 instance which can occur ==0 , <0 and >0
                if(sum == 0){
                    //add in the result
                    ans.add(Arrays.asList(nums[i] , nums[leftPtr] , nums[rightPtr]));
                    //move both the ptrs
                    leftPtr++;
                    rightPtr--;
                    //do a check if the leftptr value is same as prev element then move forward same goes for right ptr
                    while(leftPtr < rightPtr && nums[leftPtr] == nums[leftPtr-1]){
                        leftPtr++;
                    }
                    while(leftPtr < rightPtr && nums[rightPtr] == nums[rightPtr+1]){
                        rightPtr--;
                    }

                }else if(sum<0){
                    leftPtr++;
                }
                else{
                    rightPtr--;
                }
            }

        }
        return ans;
    }
}
