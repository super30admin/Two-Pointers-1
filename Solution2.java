// Time Complexity : O(N^2)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution{

    Set<List<Integer>> result;
    Set<Integer> set;
    HashMap<Integer, Integer> map;

    public List<List<Integer>> threeSum(int[] nums){
        if(nums.length<3)
            return new LinkedList<List<Integer>>();

        result = new HashSet<>();
        set = new HashSet<>();
        map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]))
                twoSum(nums,0-nums[i],i);
            else
                set.add(nums[i]);
        }

        List<List<Integer>> output = new LinkedList<>(result);
        return output;
    }

    public void twoSum(int[] nums, int target, int i){

        for(int j=i+1;j<nums.length;j++){
            int diff = target - nums[j];
            if(map.containsKey(diff) && map.get(diff)==i){
                List<Integer> res = Arrays.asList(diff,nums[i],nums[j]);
                Collections.sort(res);
                result.add(res);
            }
            map.put(nums[j],i);
        }
    }
}


Approach 2:
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution{

    public List<List<Integer>> threeSum(int[] nums){
        if(nums.length<3)
            return new LinkedList<List<Integer>>();

        List<List<Integer>> result = new LinkedList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 || (i>0 && nums[i]==nums[i-1]))
                continue;

            int low = i+1;
            int high = nums.length-1;

            while(low<high){
                int sum = nums[low]+nums[high]+nums[i];

                if(sum<0){
                    low = low+1;
                }else if(sum>0){
                    high = high-1;
                }else{
                    List<Integer> output = Arrays.asList(nums[low],nums[high],nums[i]);
                    result.add(output);
                    low = low+1;
                    high = high-1;
                    while(low<high && nums[low]==nums[low-1]){ // to avoid duplicates
                        low = low+1;
                    }
                }
            }
        }

        return result;
    }

}
