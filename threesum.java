class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr=new ArrayList<>();
        int low;
        int high;
        int complement;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            low=i+1;
            high=nums.length-1;
            complement=0-nums[i];
            if(i==0 || nums[i - 1] != nums[i]){
            while(low<high){
                
                if(nums[low]+nums[high]<complement || (nums[low]==nums[low-1] && low>i+1)){
                    low++;
                }
                else if(nums[low]+nums[high]>complement || (high<nums.length-1 && nums[high]==nums[high+1] )){
                    high--;
                }
                else{
                    arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                }
            }
            }
        }
        return arr;
    }
}