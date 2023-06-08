import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // brute force : find all possible pairs and check O(n^3)

        // for 2sum approach, using hashset we get Time O(n) and Space O(n)
        // for 2sum approach, using sort we get Time O(nlogn) and Space O(1)

        // for each, use 2sum approach to get target - cur, O(n * (O(2sum))) ans Space O(n)
        // Another idea, sort it and use 2 pointers, it will be O(n^2) and Space O(1)

        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

       for (int i=0; i<n-2; i++){
           // outsied 
           if (i>0 && nums[i]==nums[i-1]) continue;

           int l = i+1;
           int r = n-1;

           while(l<r) {
               int sum = nums[i] + nums[l] + nums[r];

               if (sum==0){
                   List<Integer> li = Arrays.asList(nums[i], nums[l], nums[r]);
                   res.add(li);
                   l++;
                   r--;
                   while (l<r && nums[l] == nums[l-1]) l++;
                   while (l<r && nums[r] == nums[r+1]) r--;
               } else if (sum >0){
                   r--;
               } else {
                   l++;
               }
           }
       }
       return res;
    }
}