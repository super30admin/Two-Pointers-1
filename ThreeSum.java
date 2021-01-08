// Time Complexity : 0(n^2)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Missed out on couple of edge cases

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new LinkedList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0)
                break;
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int low = i+1, high = nums.length-1, sum = 0 - nums[i];
                while(low<high){
                    if(nums[low] + nums[high]==sum){
                        lists.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1])
                            low++;
                        while(low<high && nums[high]==nums[high-1])
                            high--;

                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high]<sum)
                        low++;
                    else
                        high--;
                }
            }
        }

        return lists;
    }
}