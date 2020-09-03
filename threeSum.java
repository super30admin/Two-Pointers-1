    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/3sum/
    Time Complexity for operators : o(n2) 
    Extra Space Complexity for operators : o(1) .. LIST is the required return type.
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Sort the array and chck with  the index+1.

        # Optimized approach same like basic approach: 
                              
            # 1. traverse thru thee array and get the value of the position but change the index of that value by multiplying
                 it by -1.
              2. You will get all those index which are missing if it has positive value.
              3. next for loop to check position numbers and indexes of those number to the list (indexs+1).
              4. return list.
       */

    import java.util.*;
    public class threeSum{

            public static void main(String args[]) {
                        int nums[] = new int[]{-1, 0, 1, 2, -1, -4};
                        List<List<Integer>>list = threeSumProblem(nums);
                        System.out.println(list);
            }
                
                            
            public static List<List<Integer>> threeSumProblem(int nums[]) {
                if(nums==null || nums.length==0)
                    return new ArrayList<>();
        
                Arrays.sort(nums);
                List<List<Integer>> results = new ArrayList<List<Integer>>();

                for(int i=0;i<nums.length;i++){
                    if(i == 0 || nums[i-1] != nums[i])
                        calculation(i,nums,results);
                }
                
                return results;
            }

            public static void calculation(int i, int[] nums,List<List<Integer>> results){
        
                int lo = i+1,hi=nums.length-1;
                while(lo < hi){
                    int sum = nums[i] + nums[lo] + nums[hi];
                    
                    if(sum == 0){
                        results.add(Arrays.asList(nums[i],nums[lo++],nums[hi--]));
                        while(lo < hi && nums[lo] == nums [lo-1])
                            ++lo;
                    }
                    else if(sum < 0){
                        lo++;
                    }
                    else {
                        hi--;
                    }
                }
            }
    }