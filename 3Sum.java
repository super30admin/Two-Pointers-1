class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                int target = nums[i]*-1;
                this.twoSum(nums,i+1,nums.length-1,target);
            }
                
            
            
        }

        return ans;
        
    }
    public void twoSum(int [] nums,int left,int right,int target){
        while(left<right){
            if(nums[left]+nums[right]==target){
                List<Integer> list = new ArrayList<>();
                list.add(nums[left]);
                list.add(nums[right]);
                list.add(-target);
                ans.add(list);
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right+1]){
                    right--;
                }
            }
            else if(nums[left]+nums[right]>target){
                right--;
            }
            else{
                left++;
            }
        }

    }
}