/**
TC - O(nlogn) for sorting + O(n^2) by applying the 2 sum.
SC - O(1)

**/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        final List<List<Integer>> result = new ArrayList<>();
        
        if (nums.length == 0)
        {
            return result;
        }
        
        Arrays.sort(nums);
        
       for (int i=0; i<nums.length - 2; i++)
       {
           if (i != 0 && nums[i] == nums[i-1])
           {
               continue;
           }
           
           
           int l = i+1;
           int r = nums.length-1;
           
           while (l < r)
           {
               int currSum = nums[i] + nums[l] + nums[r];
               
               if (currSum == 0)
               {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[l], nums[r]);
                        result.add(triplet);

                   l++;
                   r--;
                   
                   while(l<r && nums[l] == nums[l-1])
                   {
                       l++;
                   }
                   
               }
               else if (currSum > 0)
               {
                    r--;   
               }
               else
               {
                   l++;
               }
           }
       }
        return result;
    }
}