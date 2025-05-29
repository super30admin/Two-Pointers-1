//3sum
//Time Complexity : O(n*n)
//Space Complexity : O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i < n-2; i++){
            //outside duplicacy
            if(i!=0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int low = i+1;
            int high = n-1;
            while(low < high){
                int currSum = nums[i] + nums[low] + nums[high];
                if(currSum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                
                while(low < high && nums[low] == nums[low -1]){
                    low++;
                }
                while(low < high && nums[high] == nums[high + 1]){
                    high--;
                }
            }else if(currSum > 0){
                high--;
            } else{
                low ++;
            }
        }
    }
    
    return result;
}
}
