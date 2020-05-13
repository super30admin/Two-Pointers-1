//LeetCode:15 3sum 
//Time Complexity : O(n^2) // O(nlogn+ n^2) where n is number of elements in nums
//Space Complexity : O(1) // List is auxillary space
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums== null | nums.length<3){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        List<Integer> ls;
        int sum=0;
        for(int i=0; i<nums.length-2;i++){
            
            int low= i+1;
            int high =nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
      
            while(low<high){
               
                sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    ls= new ArrayList<Integer>();
                    ls.add(nums[i]);
                    ls.add(nums[low]);
                    ls.add(nums[high]);
                    res.add(ls);
                    high--;
                    low++;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else{
                    if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
                }
                
            }
     
        }
        return res;
    }
}