//Time Complexity: O(n^2)
//Space Complexity: O(1)
//Two get the list of 3 numbers that form the sum 0, we use the approach of two pointers. We have an outer loop that iterates 
//through each element from the beginning and we use the two pointer technique on the rest of the array to find the compliment of the 
//given sum. Also we are able to remove duplicacy in the outside and the inside loop as well.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums==null || nums.length<3) return new ArrayList<>();
        
        Arrays.sort(nums);
        int n = nums.length ;
        
        for (int i = 0; i < n-2;i++){
            if(i!= 0 && nums[i] == nums[i-1])continue;
            int low = i+1;
            int high = n-1;
            
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                
                if(sum == 0){
                    List <Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++; high--;
                    
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                }else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }
            
        }
        return result;
    }
    
}