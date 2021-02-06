import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3){
            return new ArrayList<>();
        }
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i-1]==nums[i]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    output.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left+=1;
                    right-=1;
                    while(left<right && nums[left-1]==nums[left]){
                        left+=1;
                    }
                    while(left<right && nums[right+1]==nums[right]){
                        right-=1;
                    }
                }
                else if(sum<0){
                    left+=1;
                    while(left<right && nums[left-1]==nums[left]){
                        left+=1;
                    }
                }
                else{
                    right-=1;
                    while(left<right && nums[right+1]==nums[right]){
                        right-=1;
                    }
                }

            }
        }
        return output;
    }
}
//time complexity=o(n*n)
//space complexity=o(1)