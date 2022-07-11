//Microsoft interview
//TC= O(nlogn)
//Sc= O(1)
//Optimize approach:given array using pointer approach the given array should be converted to sorted array then conside the maximum value based on that increment towards left. here we are doing first sorting and storing the number in given array.If sum is >0 move left.

//Brute force:using hashset and pointer but in hashset cannot be stored duplicated key values.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i]>0) break;
            int left = i+1;
            int right = n-1;
            
            //2 pointer now
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right --;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
            }
        }
        return result;
    }
}