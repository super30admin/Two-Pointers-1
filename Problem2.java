/**
 * Time Complexity - O(n^2 + nLogn) ~ O(n^2)
 * Space Complexity - O(1)
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if(nums == null || nums.length<=2){
            return result;
        }

        Arrays.sort(nums);

        for(int i=0; i<nums.length-2;i++){

            if(i==0 || i>0 && nums[i] != nums[i-1]){

                int low = i+1;
                int high = nums.length-1;
                int sum = -nums[i];

                while(low < high){

                    if(nums[low] + nums[high] == sum){
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low] == nums[low+1]){
                            low++;
                        }
                        while(low < high && nums[high]==nums[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    }else if(nums[low] + nums[high] < sum){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return result;
    }
}