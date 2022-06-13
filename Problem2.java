// Time Complexity : O (N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

//Problem statement: https://leetcode.com/problems/3sum/

class Problem2 {
    //Two pointer solution
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> master = new ArrayList<>();

        if(nums.length == 0 || nums == null){
            return master;
        }

        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i< n-2; i++){
            int low = i+1;
            int high = n-1;

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] > 0){
                break;
            }

            while(low < high){
                int sum = nums[low] + nums[high] + nums[i];

                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[low], nums[high], nums[i]);
                    master.add(list);
                    low++;
                    high--;

                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;

                }else if(sum > 0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return master;
    }
}