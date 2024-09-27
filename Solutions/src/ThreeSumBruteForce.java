// Time Complexity :O(n^3)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :No
// Any problem you faced while coding this : failing test cases


// Your code here along with comments explaining your approach
import java.util.*;

import java.util.HashSet;
        import java.util.List;

class ThreeSumBruteForce {
    public Boolean checkDuplicates(HashSet set, List<List<Integer>> res){
        for(List<Integer> tmp:res){
            HashSet<Integer> s = new HashSet<Integer>();
            for (int elem :tmp){

                s.add(elem);
            }
            if(s.equals(set)){
                return true;
            }

        }
        return false;

    }
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length==0){
            List<List<Integer>> a = new LinkedList<>();
            return  a;
        }
        List<List<Integer>> result = new LinkedList<>();
        int p = 0;
        int q = 1;
        int r = 2;
        while(p<nums.length){
            if(r > nums.length-1){
                q = q+1;
                r = q+1;
            }

            if (q > nums.length-1 ){
                p = p+1;
                q = p+1;
                r = q+1;
            }

            if (p+q+r == 0){
                HashSet<Integer> test = new HashSet<Integer>();
                test.add(nums[p]);
                test.add(nums[q]);
                test.add(nums[r]);
                if(!checkDuplicates(test,result)){
                    List<Integer> tmp = new LinkedList<>();
                    tmp.add(nums[p]);
                    tmp.add(nums[q]);
                    tmp.add(nums[r]);
                    result.add(tmp);
                }

                test.clear();
            }
            else{
                r = r+1;
            }
        }
        return result;
    }
}
