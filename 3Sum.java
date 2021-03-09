// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//two pointers method
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return output ;
        }
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 2; i++){
		if(nums[i] > 0) break;
            //repetition on outside loop
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    output.add(li);
                    low++;
                    high--;
                    //no repition in the inside loop of pointers
                    
                    while(low<high && nums[low] == nums[low - 1]) low++;
                    while(low<high && nums[high] == nums[high + 1]) high--;
                    
                    
                    
                }
                else if(sum < 0){
                    low++;
                }
                else{
                    high--;
                }
                
            }
        }
     return output;   
    }
}

//Bruteforce
// Time Complexity : O(n^3)
// Space Complexity : O(n)
/*
//time limit exceeds
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return output ;
        }
        HashSet <List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k= j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer> li = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(li);
                        if(!set.contains(li)){
                            output.add(li);
                            set.add(li);
                        }
                    }
                }
            }
        }
     return output;   
    }
}
*/