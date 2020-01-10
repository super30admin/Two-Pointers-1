// Time complexity 0(n)
// space complexity 0(1)
// Code successfully executed in leetcode
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
    List<List<Integer>> result = new ArrayList<>();

         //Edge
      if(nums == null || nums.length < 3) return result;

        Arrays.sort(nums);
         //[-1, 0, 1, 2, -1, -4]
       for(int i=0; i<nums.length-2; i++){
             if(nums[i] > 0) break;
             if(i>0 && nums[i] == nums[i-1]) continue;

             int low = i+1;
             int high = nums.length - 1;

             while(low < high){
                 int sum = nums[i] + nums[low] + nums[high];

                 if(sum == 0){
                     result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                     low++;
                     high--;
  //once the first to be element is fixed, while finding other two elements
                     //if we low[i-1] and low[i] might be same; then again we end up getting same triplets
                     //so, check that aswell
                     //also imp check l< h
                     while(low<high && nums[low] == nums[low-1]) low++;
                     while(low<high && nums[high] == nums[high+1]) high--;

                 }
                 else if(sum < 0){ low++;}
                 else{high--;}
             }

         }
         return result;
     }

        
    }

