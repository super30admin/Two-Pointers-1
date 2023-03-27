class Solution {
//TC--> O(n2)
//SC--> O(n)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue; // check for controlling outer duplicacy
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;right--;
                    //result.add(new ArrayList<Integer>(nums[i], nums[left], nums[right]));
                //SUM has been found to be zero. Check for internal duplicacy
                while(left< right && nums[left]== nums[left-1])left++;
                while(left<right && nums[right]== nums[right+1]) right --;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
      
        return result;
    }
}