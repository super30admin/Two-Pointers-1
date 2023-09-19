// TC O(n^2)
//SC O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>>list = new ArrayList<>();

        if(nums == null || nums.length < 3 ){
            return list;
        }
        Arrays.sort(nums);

        int n = nums.length;


        for(int i=0; i<n; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] > 0){
                break;
            }
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
               // System.out.println("i,j,k" + nums[i] + "-"+ nums[left] + "-" + nums[right]);
                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && (nums[left] == nums[left-1])){
                        left++;
                    }
                    while(left < right && (nums[right] == nums[right+1])){
                        right--;
                    }
                    
                }
                else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
    return list;
        
    }
}