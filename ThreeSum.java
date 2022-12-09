//TC : nlog(n)+n^2 = n^2
//SC: O(1)

//https://leetcode.com/problems/3sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3) return new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>(); 
        for(int i=0; i<n;i++){
            if(nums[i] >0) break;
            //handling outer duplicates
            if(i>0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while(low < high){
                int sum = nums[i]+ nums[low] + nums[high];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    //handling inner duplicates
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                }else if(sum <0){
                    low++;
                }else{
                    high--;
                }
            }


        }
        return list;
    }

}
