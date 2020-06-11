/*
    Time Complexity : O(N^3)
    Space Complexity :O(N)
    is worked on leetcode  : NO Time limit Exceeded

*/

/*
    Brute Force Solution for 3SUM
*/

public class 3SUM{
    public List<List<Integer>> threeSum(int[] nums) {
        if  (nums == null || nums.length == 0){
            return new ArrayList<List<Integer>>();
        }
        int n = nums.length;
        Set<List<Integer>> al = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i < n-2;i++){
            for( int j=i+1;j < n-1; j++){
                for(int k = j+1; k< n;k++){
                    if( (nums[i]+nums[j]+nums[k] )== 0){
                         List<Integer> ala = new ArrayList<Integer>();
                         ala.add(nums[i]);
                         ala.add(nums[j]);
                         ala.add(nums[k]);
                         Collections.sort(ala);
                         al.add(ala);
                    }
                }
            }
        }
        return  new ArrayList<List<Integer>>(al);
    }

}

