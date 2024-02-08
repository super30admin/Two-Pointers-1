//Time - O(n2)
//space - O(n)
class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       HashSet<ArrayList<Integer>> set = new HashSet<>();
       for(int i=0;i<nums.length-2;i++){
           int j =i+1;
           int k = nums.length-1;
           while(j<k){
               int sum = nums[i]+nums[j]+nums[k];
               if(sum==0){
                   ArrayList<Integer> li = new ArrayList<>();
                   li.add(nums[i]);
                   li.add(nums[j]);
                   li.add(nums[k]);
                   Collections.sort(li);
                   set.add(li);
                   j++;
                   k--;
               }
               else if(sum>0){
                   k--;
               }
               else{
                   j++;
               }
           }
       }
       return new ArrayList<>(set);
      
   }
}
