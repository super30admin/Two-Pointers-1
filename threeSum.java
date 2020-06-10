// Time Complexity :O(n^2) n is the array length;
// Space Complexity :O(1);
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if(nums==null || nums.length<3)return result;
        Arrays.sort(nums);
        int n = nums.length;
        for(int l = 0;l<n-2;l++){
            //edge case 1
            if(l>0 && nums[l]==nums[l-1])continue;
            if(nums[l]>0) break;
                int m = l+1;
                int h = n-1;
                while(m<h){
                   int sum = nums[l] + nums[m] + nums[h];
                   if(sum == 0){
                       List<Integer> li = Arrays.asList(nums[l],nums[m],nums[h]);
                       result.add(li);
                       h--;
                       m++;
                       while(m<h && nums[h+1] == nums[h]) h--;
                       while(h>m && nums[m] == nums[m-1]) m++;
                       
                    }
                    else if( sum <0){
                        m++;
                    }
                    else{
                        h--;
                    }
                }
                
           
        }
        
        return result;
    }
}