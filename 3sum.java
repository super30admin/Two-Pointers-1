// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// loop once then try two-pointer approach similar to two-sum

public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    for(int c = 0; c< nums.length-2;c++){
        if(c>0 && nums[c] == nums[c-1]){
            continue;
        }
        int a = c+1;
        int b = nums.length-1;
            while(a<b){
                int sum = nums[a] + nums[b] + nums[c];
                if(sum < 0){
                    a++;
                } else if(sum > 0){
                    b--;
                } else {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[c]);
                    temp.add(nums[a]);
                    temp.add(nums[b]);
                    res.add(temp);
                    while(a<b && nums[a]==nums[a+1]){
                        a++;
                    }
                    while(b>a && nums[b]==nums[b-1]){
                        b--;
                    }
                    a++;
                    b--;
                }
            }
    }
    return res;
}