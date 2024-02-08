//The algorithm finds all unique triplets in the sorted array nums that sum to zero. 
//It uses a three-pointer approach with two pointers (low and high) moving towards each other for each fixed i. 
//The algorithm avoids duplicate triplets by skipping identical elements and duplicates within the triplet. 
//The time complexity is O(n^2), where n is the length of the input array nums, and the space complexity is O(1).
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0;i<n;i++){
            if(i != 0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int low =i+1, high = n-1;
            while(low<high){
                int sum = nums[i] + nums[low]+nums[high];
                if(sum ==0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low<high && nums[low] == nums[low-1]){
                        low++;
                    }
                     while(low<high && nums[high] == nums[high+1]){
                       high--;
                    }
                }
                    else if(sum > 0){
                        high--;
                    }
                    else{
                        low++;
                    }
                
            }
        } return result;
        
    }
}