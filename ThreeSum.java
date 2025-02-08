import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*
2 pointer solution.
Firstly, we sort the array. Then we iterate from left to right. For each index on left, using 2 pointers we check if there are pairs on the right 
that make sum of all 3 elements as 0. To avoid duplicates, when checking using 2 pointers, we go ahead(or decrement) till the number is same. 
While iterating left to right, once we reach an element>target, we stop.
*/

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        //check for base condition
        int n =nums.length;
        if(n<3){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(nums[i]>0){
                return res;
            }
            
            while(i<n-2 && i>0 && nums[i]==nums[i-1]){
                i++;
            }
            
            int l=i+1;
            int r=n-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    List<Integer> li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    res.add(li);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }else if(nums[i]+nums[l]+nums[r]>0){
                    r--;
                }else{
                    l++;
                }
                
            }
            if(nums[i]==nums[i+1]){
                i++;
            }
        }
        return res;
    }
}
