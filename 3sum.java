 // Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run : yes
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> result = new HashSet<>(); 
     
        Arrays.sort(nums);
        for(int first =0; first<n-2; first++){
            if(first>0 && nums[first] == nums[first-1]) continue;
            int j = first+1;
            int last = n-1;
            while(j<last){
                 int sum = nums[first]+ nums[j] + nums[last];
                if(sum==0){
                    List<Integer> li = Arrays.asList(nums[first], nums[j], nums[last]);
                    result.add(li);
                    j++;last--;
                    while(j<last && nums[j] ==nums[j-1]) j++;
                    while(j<last && nums[last] == nums[last+1]) last--;
                }else if(sum <0){
                    j++;
                }
                else{
                    last --;
                    
                }
                
            }
        }
        return new ArrayList<>(result);
        
    }
}