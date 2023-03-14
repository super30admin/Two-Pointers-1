// Time Complexity : O(nlogn)
// Space Complexity : none
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = num.length - 1;
        ArrayList<int[]> res = new ArrayList<int[]>();
        for (int i =0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            l = i+1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]>0){
                    r-=1;
                }
                else if (nums[i]+nums[l]+nums[r]<0){
                    l+=1;
                }
                else{
                    int[] arr = new int[3];
                    arr.add(nums[i]);
                    arr.add(nums[l]);
                    arr.add(nums[r]);
                    //arr = {nums[i],nums[j],nums[r]};
                    res.add(arr);
                    l+=1;
                    while(l > 0 && nums[l]==nums[l-1] && l< nums.length){
                        l+=1;
                    }
                }
            }
            
        }
        return res
    }
}