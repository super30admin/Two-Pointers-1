// Time Complexity : O(N * Log N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =  new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i = 0; i< nums.length - 2; i++){
            if(i != 0 && nums[i] == nums[i-1]){ 
                continue; //Same elements
            }
            int l = i + 1;
            int h = nums.length - 1;
            
            while(l < h){
                int sum = nums[i] + nums[l] + nums[h];
                
                if(sum == 0){   // Sum == 0 -> Add this triplet in result list
                    //We will be not having same/Duplicate triplets as we skip the same elements so....
                    List<Integer> temp = Arrays.asList(nums[i], nums[l], nums[h]);
                    list.add(temp);
                    l++; 
                    h--;
                    
                    //Skipping same elements
                    while(l < h && nums[l] == nums[l-1])    l++;
                    while(l < h && nums[h] == nums[h+1])    h--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    h--;
                }
            }
        }
        
        
        return list;

    }
}
