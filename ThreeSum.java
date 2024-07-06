//time complexity: O(n*n) where n is length of input array
//space complexity: O(1) No extra Data structure created other than result list

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int r=n-1;
            int l=i+1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum>0){
                    r--;
                }
                else if(sum<0){
                    l++;
                } else{
                    result.add(Arrays.asList(nums[i], nums[r], nums[l]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }
            }
        }
        return result;
    }

     public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(nums).toString());
        
    }
}